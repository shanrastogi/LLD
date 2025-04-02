package com.example.abstractfactory.models;

public class FactoryOfSource {
    IngestToDB ingestToDBInstance = null;
    public IngestToDB getInstance(String source){
        if (source.equalsIgnoreCase("file")) {
            ingestToDBInstance = new SourceDataFromFile();
        } else if (source.equalsIgnoreCase("api")) {
            ingestToDBInstance = new SourceDataFromAPI();
        } else if (source.equalsIgnoreCase("datalake")) {
            ingestToDBInstance = new SourceDataFromDataLake();
        } else {
            System.out.println("Invalid source type. Please use 'file' or 'api' or 'datalake'.");
            return null;
        }
        return ingestToDBInstance;
    }
}
