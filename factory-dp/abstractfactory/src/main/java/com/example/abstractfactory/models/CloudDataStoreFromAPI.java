package com.example.abstractfactory.models;

public class CloudDataStoreFromAPI implements IngestToDB {
    @Override
    public void ingestData() {
        // Logic to ingest data from cloud API
        System.out.println("Ingesting data from cloud API...");
    }

}
