package kr.co.kbinsure.helloworld.factorymethod.service;

public enum StorageType {
    FILE("file"), DBMS("dbms");

    private final String s;

    StorageType(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }

    public static StorageType get(String s) {
        if (s.equals(FILE.toString()))
            return FILE;
        if (s.equals(DBMS.toString()))
            return DBMS;
        return null;
    }
}
