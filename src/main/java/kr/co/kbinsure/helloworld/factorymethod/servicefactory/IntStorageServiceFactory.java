package kr.co.kbinsure.helloworld.factorymethod.servicefactory;

import kr.co.kbinsure.helloworld.factorymethod.service.LocationType;
import kr.co.kbinsure.helloworld.factorymethod.service.StorageService;
import kr.co.kbinsure.helloworld.factorymethod.service.StorageType;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class IntStorageServiceFactory extends StorageServiceFactory {
    private final Map<StorageType, StorageService> serviceMap = new HashMap<>();

    public IntStorageServiceFactory(List<StorageService> serviceList) {
        serviceList.stream()
                .filter(s -> s.getLocationType() == LocationType.INT)
                .forEach(s -> serviceMap.put(s.getStorageType(), s));
    }

    @Override
    protected StorageService getService(StorageType type) {
        return serviceMap.get(type);
    }
}