package com.company;

public class Printer {
    private int printerId;
    private String printerName;

    public Printer(int printerId, String printerName) {
        this.printerId = printerId;
        this.printerName = printerName;
    }

    public int getPrinterId() {
        return printerId;
    }

    public String getPrinterName() {
        return printerName;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "printerId=" + printerId +
                ", printerName='" + printerName + '\'' +
                '}';
    }
}
