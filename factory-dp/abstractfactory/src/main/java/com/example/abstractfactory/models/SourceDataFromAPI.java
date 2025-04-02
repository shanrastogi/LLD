package com.example.abstractfactory.models;

public class SourceDataFromAPI implements IngestToDB {
    @Override
    public void ingestData() {
        // Logic to ingest data from API
        System.out.println("Ingesting data from API...");
    }
}
