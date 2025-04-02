package com.example.abstractfactory.models;

public class OnPremiseStoreService implements IngestionService {
    @Override
    public IngestToDB getInstance(String source) {
        if (source.equals("file")) {
            return new SourceDataFromFile();
        } else if (source.equals("api")) {
            return new SourceDataFromAPI();
        } else if (source.equals("datalake")) {
            return new SourceDataFromDataLake();
        }
        return null;
    }

}
