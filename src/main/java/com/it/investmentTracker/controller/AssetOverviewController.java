package com.it.investmentTracker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/asset")
public class AssetOverviewController {


    @RequestMapping(method =  RequestMethod.GET, path = "/data/getAllAssets")
    public ResponseEntity<String> testClass(){

        return ResponseEntity.ok("Success");
        
    }
}
