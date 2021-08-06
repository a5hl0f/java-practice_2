package com.company;

public class FACTORY {
    private int numberofCreatedprinter;

    public FACTORY() {
        numberofCreatedprinter=0;
    }
    public Printer createdNewPrinter(String printername){
        numberofCreatedprinter++;
        return new Printer(numberofCreatedprinter,printername);
    }
}
