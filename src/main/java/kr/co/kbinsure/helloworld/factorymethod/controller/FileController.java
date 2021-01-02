package kr.co.kbinsure.helloworld.factorymethod.controller;

import kr.co.kbinsure.helloworld.factorymethod.service.StorageType;
import kr.co.kbinsure.helloworld.factorymethod.servicefactory.ExtStorageServiceFactory;
import kr.co.kbinsure.helloworld.factorymethod.servicefactory.IntStorageServiceFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FileController {
    private final IntStorageServiceFactory intStorageServiceFactory;
    private final ExtStorageServiceFactory extStorageServiceFactory;

    public FileController(IntStorageServiceFactory intStorageServiceFactory
            , ExtStorageServiceFactory extStorageServiceFactory) {
        this.intStorageServiceFactory = intStorageServiceFactory;
        this.extStorageServiceFactory = extStorageServiceFactory;
    }

    @GetMapping("/int/file")
    @ResponseBody
    public String getIntFile(@RequestParam String type) {
        return intStorageServiceFactory.get(StorageType.get(type))
                .getFile();
    }

    @GetMapping("/ext/file")
    @ResponseBody
    public String getExtFile(@RequestParam String type) {
        return extStorageServiceFactory.get(StorageType.get(type))
                .getFile();
    }
}
