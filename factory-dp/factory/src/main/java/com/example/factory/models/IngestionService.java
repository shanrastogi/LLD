package com.example.factory.models;

public class IngestionService {
    private FactoryOfSource factoryOfSource;

    public IngestionService(FactoryOfSource factoryOfSource) {
        this.factoryOfSource = factoryOfSource;
    }

    public void ingestToMyDatabase(String source) {
        IngestToDB ingestToDB = factoryOfSource.getInstance(source);
        if(ingestToDB == null) {
            System.out.println("Ingestion failed due to invalid source type.");
            return;
        }
        ingestToDB.ingestData();
    }

}
