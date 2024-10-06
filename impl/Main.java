package impl;

import functionalinterfaces.IPrint;

public class Main {
    public static void main(String[] args) {
        IPrint print=new ConsolePrinterImpl();
        print.print();

        //using inner class
        IPrint print1=new IPrint() {
            @Override
            public void print() {
                System.out.println("inner class way");
            }
        };
        print1.print();

        //using lambda
        IPrint print2=()->System.out.println("lambda way");
        print2.print();
    }
}
