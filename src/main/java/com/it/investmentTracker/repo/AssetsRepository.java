package com.it.investmentTracker.repo;

import com.it.investmentTracker.model.AssetsBean;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetsRepository extends MongoRepository<AssetsBean,String> {
}
