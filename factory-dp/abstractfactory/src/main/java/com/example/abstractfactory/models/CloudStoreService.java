package com.example.abstractfactory.models;

public class CloudStoreService implements IngestionService{
    @Override
    public IngestToDB getInstance(String sourceType) {
        if (sourceType.equalsIgnoreCase("file")) {
            return new CloudDataStoreFromFile();
        } else if (sourceType.equalsIgnoreCase("api")) {
            return new CloudDataStoreFromAPI();
        }
        return null;
    } 

}
