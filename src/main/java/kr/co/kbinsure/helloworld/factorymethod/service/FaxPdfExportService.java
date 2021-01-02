package kr.co.kbinsure.helloworld.factorymethod.service;

import org.springframework.stereotype.Service;

@Service
public class FaxPdfExportService implements ExportService {
    @Override
    public String export() {
        System.out.println("FaxPdfExportService.export");
        return "fax.pdf";
    }

    @Override
    public void transfer(String fileName) {
        System.out.println("FaxPdfExportService.transfer");
    }

    @Override
    public void deleteLocal(String fileName) {
        System.out.println("FaxPdfExportService.deleteLocal");
    }

    @Override
    public ExportType getExportType() {
        return ExportType.PDF;
    }

    @Override
    public TargetType getTargetType() {
        return TargetType.FAX;
    }
}
