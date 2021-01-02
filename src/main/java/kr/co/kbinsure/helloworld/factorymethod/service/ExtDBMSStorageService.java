package kr.co.kbinsure.helloworld.factorymethod.service;

import org.springframework.stereotype.Service;

@Service
public class ExtDBMSStorageService implements StorageService {
    @Override
    public String getFile() {
        return "외부망-DBMS";
    }

    @Override
    public StorageType getStorageType() {
        return StorageType.DBMS;
    }

    @Override
    public LocationType getLocationType() {
        return LocationType.EXT;
    }
}
