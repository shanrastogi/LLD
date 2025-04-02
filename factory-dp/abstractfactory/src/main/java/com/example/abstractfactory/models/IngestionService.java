package com.example.abstractfactory.models;

public interface IngestionService {
    default void ingestToMyDatabase(String source) {
        IngestToDB ingestToDB = getInstance(source);
        if (ingestToDB == null) {
            System.out.println("Ingestion failed due to invalid source type.");
            return;
        }
        ingestToDB.ingestData();
    }

    IngestToDB getInstance(String source);
}
