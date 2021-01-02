package kr.co.kbinsure.helloworld.factorymethod.service;

public interface ExportService {
    String export();

    void transfer(String fileName);

    void deleteLocal(String fileName);

    ExportType getExportType();

    TargetType getTargetType();
}
