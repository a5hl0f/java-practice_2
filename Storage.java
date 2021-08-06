package com.company;

import java.util.ArrayList;
import java.util.Comparator;

public class Storage {
    private ArrayList<Printer> printerStorage;
    public Storage() {
        printerStorage=new ArrayList<>();

    }

    public void add(Printer create) {
        printerStorage.add(create);
    }

    public int size() {
        return printerStorage.size();
    }

    public Printer get(int i) {
        return printerStorage.get(i);
    }

    public void remove(int d) {
      printerStorage.remove(d);
    }



    public void sortbyname(){
        printerStorage.sort((s1,s2)->s1.getPrinterName().compareToIgnoreCase(s2.getPrinterName()));
    }
}
