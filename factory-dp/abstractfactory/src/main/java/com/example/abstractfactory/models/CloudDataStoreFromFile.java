package com.example.abstractfactory.models;

public class CloudDataStoreFromFile implements IngestToDB {
    @Override
    public void ingestData() {
        // Logic to ingest data from cloud file
        System.out.println("Ingesting data from cloud file...");
    }

}
