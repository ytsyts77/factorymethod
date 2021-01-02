package kr.co.kbinsure.helloworld.factorymethod.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class StorageTypeTest {
    @Test
    void test() {
        assertTrue(StorageType.DBMS == StorageType.DBMS);
        assertTrue(StorageType.FILE == StorageType.FILE);
        assertTrue(StorageType.DBMS != StorageType.FILE);
        assertTrue(StorageType.FILE != StorageType.DBMS);
        assertTrue(StorageType.DBMS == StorageType.get("dbms"));
        assertTrue(StorageType.FILE == StorageType.get("file"));
    }
}