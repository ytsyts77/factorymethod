package kr.co.kbinsure.helloworld.factorymethod.service;

import org.springframework.stereotype.Service;

@Service
public class ExtFileStorageService implements StorageService {
    @Override
    public String getFile() {
        return "외부망-FILE";
    }

    @Override
    public StorageType getStorageType() {
        return StorageType.FILE;
    }

    @Override
    public LocationType getLocationType() {
        return LocationType.EXT;
    }
}
