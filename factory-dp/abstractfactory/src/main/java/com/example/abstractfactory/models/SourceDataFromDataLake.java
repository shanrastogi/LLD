package com.example.abstractfactory.models;

public class SourceDataFromDataLake implements IngestToDB {
    @Override
    public void ingestData() {
        // Logic to ingest data from data lake
        System.out.println("Ingesting data from data lake...");
    }

}
