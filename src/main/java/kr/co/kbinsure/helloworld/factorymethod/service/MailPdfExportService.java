package kr.co.kbinsure.helloworld.factorymethod.service;

import org.springframework.stereotype.Service;

@Service
public class MailPdfExportService implements ExportService {
    @Override
    public String export() {
        System.out.println("MailPdfExportService.export");
        return "mail.pdf";
    }

    @Override
    public void transfer(String fileName) {
        System.out.println("MailPdfExportService.transfer");
    }

    @Override
    public void deleteLocal(String fileName) {
        System.out.println("MailPdfExportService.deleteLocal");
    }

    @Override
    public ExportType getExportType() {
        return ExportType.PDF;
    }

    @Override
    public TargetType getTargetType() {
        return TargetType.MAIL;
    }
}
