package com.it.investmentTracker.controller;

import com.it.investmentTracker.model.AssetsBean;
import com.it.investmentTracker.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/asset")
public class AssetOverviewController {

    @Autowired
    private AssetService assetService;

    @RequestMapping(method = RequestMethod.GET, path = "/data/getAllAssets")
    public ResponseEntity<List<AssetsBean>> testClass() {

        return assetService.getAllRecords().map(ResponseEntity::ok).orElse(new ResponseEntity<>(HttpStatus.NO_CONTENT));

    }

    @RequestMapping(method = RequestMethod.GET, path = "/data/loadAllData")
    public ResponseEntity<String> loadAllData() {

        return assetService.loadData().map(ResponseEntity::ok).orElse(new ResponseEntity<>(HttpStatus.NO_CONTENT));

    }
}
