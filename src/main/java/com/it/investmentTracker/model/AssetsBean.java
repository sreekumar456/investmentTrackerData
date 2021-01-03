package com.it.investmentTracker.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "assets")
public class AssetsBean implements Serializable {


    @Transient
    public static final String SEQUENCE_NAME = "assets_sequence";

    @Id
    private long assetId;

    private String assetName;

    private String currency;

    private int amount;

    private String percentageOfTotal;


}
