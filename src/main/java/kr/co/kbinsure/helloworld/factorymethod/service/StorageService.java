package kr.co.kbinsure.helloworld.factorymethod.service;

public interface StorageService {
    String getFile();

    StorageType getStorageType();

    LocationType getLocationType();
}
