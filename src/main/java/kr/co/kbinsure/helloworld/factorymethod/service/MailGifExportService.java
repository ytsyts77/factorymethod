package kr.co.kbinsure.helloworld.factorymethod.service;

import org.springframework.stereotype.Service;

@Service
public class MailGifExportService implements ExportService {
    @Override
    public String export() {
        System.out.println("MailGifExportService.export");
        return "mail.gif";
    }

    @Override
    public void transfer(String fileName) {
        System.out.println("MailGifExportService.transfer");
    }

    @Override
    public void deleteLocal(String fileName) {
        System.out.println("MailGifExportService.deleteLocal");
    }

    @Override
    public ExportType getExportType() {
        return ExportType.GIF;
    }

    @Override
    public TargetType getTargetType() {
        return TargetType.MAIL;
    }
}