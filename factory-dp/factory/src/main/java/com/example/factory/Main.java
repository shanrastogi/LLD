package com.example.factory;

import com.example.factory.models.FactoryOfSource;
import com.example.factory.models.IngestionService;

public class Main {
    public static void main(String[] args) {
        FactoryOfSource factoryOfSource = new FactoryOfSource();
        IngestionService ingestionService = new IngestionService(factoryOfSource);
        // Ingest data from different sources
        ingestionService.ingestToMyDatabase("file");
        ingestionService.ingestToMyDatabase("datalake");
        ingestionService.ingestToMyDatabase("api");
        ingestionService.ingestToMyDatabase("apibad");
    }
}