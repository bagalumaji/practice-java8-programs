package impl;

import functionalinterfaces.IPrint;

public class LogFileImpl {
    public static void main(String[] args) {
        //functional programming
        IPrint print = ()->System.out.println("Hello World using lambda expression");
        print.print();
    }
}
