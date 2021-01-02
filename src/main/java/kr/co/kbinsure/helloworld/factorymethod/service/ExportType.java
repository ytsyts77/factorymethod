package kr.co.kbinsure.helloworld.factorymethod.service;

public enum ExportType {
    GIF("gif"), PDF("pdf");

    private final String s;

    ExportType(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }

    public static ExportType get(String s) {
        if (s.equals(GIF.toString()))
            return GIF;
        if (s.equals(PDF.toString()))
            return PDF;
        return null;
    }
}
