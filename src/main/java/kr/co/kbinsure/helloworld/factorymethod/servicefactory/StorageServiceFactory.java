package kr.co.kbinsure.helloworld.factorymethod.servicefactory;

import kr.co.kbinsure.helloworld.factorymethod.service.StorageService;
import kr.co.kbinsure.helloworld.factorymethod.service.StorageType;

public abstract class StorageServiceFactory {
    public StorageService get(StorageType type) {
        checkAuth(type);
        return getService(type);
    }

    protected abstract StorageService getService(StorageType type);

    private void checkAuth(StorageType type) {
        //접근 권한 체크...
    }
}
