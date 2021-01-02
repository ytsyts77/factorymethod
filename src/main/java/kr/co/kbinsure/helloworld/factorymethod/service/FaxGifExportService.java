package kr.co.kbinsure.helloworld.factorymethod.service;

import org.springframework.stereotype.Service;

@Service
public class FaxGifExportService implements ExportService {
    @Override
    public String export() {
        System.out.println("FaxGifExportService.export");
        return "fax.gif";
    }

    @Override
    public void transfer(String fileName) {
        System.out.println("FaxGifExportService.transfer");
    }

    @Override
    public void deleteLocal(String fileName) {
        System.out.println("FaxGifExportService.deleteLocal");
    }

    @Override
    public ExportType getExportType() {
        return ExportType.GIF;
    }

    @Override
    public TargetType getTargetType() {
        return TargetType.FAX;
    }
}
