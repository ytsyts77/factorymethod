package kr.co.kbinsure.helloworld.factorymethod.service;

import org.springframework.stereotype.Service;

@Service
public class IntDBMSStorageService implements StorageService {
    @Override
    public String getFile() {
        return "내부망-DBMS";
    }

    @Override
    public StorageType getStorageType() {
        return StorageType.DBMS;
    }

    @Override
    public LocationType getLocationType() {
        return LocationType.INT;
    }
}
