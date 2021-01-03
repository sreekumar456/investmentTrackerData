package com.it.investmentTracker.service;

import com.it.investmentTracker.model.AssetsBean;
import com.it.investmentTracker.repo.AssetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Service
public class AssetService implements Serializable {


    @Autowired
    private AssetsRepository assetsRepository;

    @Autowired
    private SequenceGeneratorService sequenceGeneratorService;


    public Optional<List<AssetsBean>> getAllRecords() {
        return Optional.ofNullable(assetsRepository.findAll());
    }

    public Optional<String> loadData() {

        assetsRepository.deleteAll();

        assetsRepository.save(AssetsBean.builder().assetId(sequenceGeneratorService.generateSequence(AssetsBean.SEQUENCE_NAME))
                .assetName("Fixed deposit").currency("SGD").amount(120000).build());


        assetsRepository.save(AssetsBean.builder().assetId(sequenceGeneratorService.generateSequence(AssetsBean.SEQUENCE_NAME))
                .assetName("Shares").currency("SGD").amount(120000).build());


        return Optional.ofNullable("success");
    }

}
