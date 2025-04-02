package com.example.abstractfactory.models;

public class SourceDataFromFile implements IngestToDB {
    @Override
    public void ingestData() {
        // Logic to ingest data from file
        System.out.println("Ingesting data from file...");
    }

}
