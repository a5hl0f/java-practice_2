package com.company;

import java.util.Scanner;

public class Controller {
    private Storage storage;
    private Scanner scanner;
    private boolean queue=true;
    private FACTORY factory;

    public Controller() {
        storage=new Storage();
        factory=new FACTORY();
        scanner=new Scanner(System.in);
    }

    public void start() {
        boolean stay=true;
        int choice;
        do{
            System.out.println("menu: 1- add new printer / 2-list printer/ 3-delete by id/ 4 connection state / 5 sorted by printername / 6 -exit");
            choice=scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:createPrinter(scanner);break;
                case 2:listprinter();break;
                case 3:deletebyID(scanner);break;
//
                case 4:setprinterstate(scanner);break;
                case 5:sortbyname();break;


                case 6:stay=false;break;
            }
        }
        while (stay);
    }

    private void sortbyname() {
     storage.sortbyname();
     listprinter();
        System.out.println("sorted by name");

}


    private void deletebyID(Scanner scanner) {
        System.out.println("please enter id which you want to delete");
        int d= scanner.nextInt();

            for (int i=0;i<storage.size();i++){
                if(storage.get(i).getPrinterId()==d){
                    storage.remove(i);
                }
            }


        }



    private void setprinterstate(Scanner scanner) {
        System.out.println("set printer state busy/empty");
        String state=scanner.nextLine();

        if(state.equals("busy")){
            System.out.println("printer is busy");
        }else {
            System.out.println("printer is ready");
            queue=false;
        }
    }

    private void listprinter() {
        for (int i=0;i<storage.size();i++){
            System.out.println(storage.get(i));

        }
    }

    private void createPrinter(Scanner scanner) {
        System.out.println("please enter printer name: ");
        String name=scanner.nextLine();
        Printer create=factory.createdNewPrinter(name);
        storage.add(create);
        if(queue){
            System.out.println("queue is empty");
        }else {
            System.out.format("queue is busy # %d",storage.size());
            System.out.println();
        }

    }

}
