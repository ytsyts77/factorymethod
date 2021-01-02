package kr.co.kbinsure.helloworld.factorymethod.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class StorageTypeTest {
    @Test
    void test() {
        assertTrue(ExportType.PDF == ExportType.PDF);
        assertTrue(ExportType.GIF == ExportType.GIF);
        assertTrue(ExportType.PDF != ExportType.GIF);
        assertTrue(ExportType.GIF != ExportType.PDF);
        assertTrue(ExportType.PDF == ExportType.get("dbms"));
        assertTrue(ExportType.GIF == ExportType.get("file"));
    }
}