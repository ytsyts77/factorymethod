package kr.co.kbinsure.helloworld.factorymethod.controller;

import kr.co.kbinsure.helloworld.factorymethod.service.ExportType;
import kr.co.kbinsure.helloworld.factorymethod.servicefactory.FaxExportServiceFactory;
import kr.co.kbinsure.helloworld.factorymethod.servicefactory.MailExportServiceFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ExportController {
    private final MailExportServiceFactory mailExportServiceFactory;
    private final FaxExportServiceFactory faxExportServiceFactory;

    public ExportController(MailExportServiceFactory intStorageServiceFactory
            , FaxExportServiceFactory extStorageServiceFactory) {
        this.mailExportServiceFactory = intStorageServiceFactory;
        this.faxExportServiceFactory = extStorageServiceFactory;
    }

    @GetMapping("/export/mail")
    public String exportMail(@RequestParam String type, Model model) {
        model.addAttribute("fileName", mailExportServiceFactory
                .exportAndTransfer(ExportType.get(type)));
        return "exportSample";
    }

    @GetMapping("/export/fax")
    public String exportFax(@RequestParam String type, Model model) {
        model.addAttribute("fileName", faxExportServiceFactory
                .exportAndTransfer(ExportType.get(type)));
        return "exportSample";
    }
}
