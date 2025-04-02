package com.example.abstractfactory.models;

public class FactoryOfStorage {
    public IngestionService getStorageServiceInstance(String storageType) {
        if(storageType.equalsIgnoreCase("onpremise")) {
            return new OnPremiseStoreService();
        } else if (storageType.equalsIgnoreCase("cloud")) {
            return new CloudStoreService();
        }
        // Add more storage types as needed
        return null;
    }
}
