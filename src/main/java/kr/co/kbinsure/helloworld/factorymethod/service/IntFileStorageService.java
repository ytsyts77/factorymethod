package kr.co.kbinsure.helloworld.factorymethod.service;

import org.springframework.stereotype.Service;

@Service
public class IntFileStorageService implements StorageService {
    @Override
    public String getFile() {
        return "내부망-FILE";
    }

    @Override
    public StorageType getStorageType() {
        return StorageType.FILE;
    }

    @Override
    public LocationType getLocationType() {
        return LocationType.INT;
    }
}
