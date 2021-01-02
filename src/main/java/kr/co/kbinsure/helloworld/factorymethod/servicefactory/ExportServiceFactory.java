package kr.co.kbinsure.helloworld.factorymethod.servicefactory;

import kr.co.kbinsure.helloworld.factorymethod.service.ExportService;
import kr.co.kbinsure.helloworld.factorymethod.service.ExportType;

public abstract class ExportServiceFactory {
    public String exportAndTransfer(ExportType type) {
        ExportService service = getService(type);
        String fileName = service.export();
        service.transfer(fileName);
        service.deleteLocal(fileName);
        return fileName;
    }

    protected abstract ExportService getService(ExportType type);
}
