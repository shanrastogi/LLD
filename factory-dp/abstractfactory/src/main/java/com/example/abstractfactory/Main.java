package com.example.abstractfactory;

import com.example.abstractfactory.models.FactoryOfStorage;
import com.example.abstractfactory.models.IngestToDB;
import com.example.abstractfactory.models.IngestionService;

public class Main {
    public static void main(String[] args) {
         FactoryOfStorage storageFactory = new FactoryOfStorage();
        IngestionService ingestionService = storageFactory.getStorageServiceInstance("onpremise");
        IngestToDB onPremiseObject = ingestionService.getInstance("file");
        if(onPremiseObject == null) {
            System.out.println("Invalid source type for on-premise storage");
            return;
        }
        onPremiseObject.ingestData();

        IngestionService cloudIngestionService = storageFactory.getStorageServiceInstance("cloud");
        IngestToDB cloudObject = cloudIngestionService.getInstance("api");
        if(cloudObject == null) {
            System.out.println("Invalid source type for cloud storage");
            return;
        }
        cloudObject.ingestData();
    }
}