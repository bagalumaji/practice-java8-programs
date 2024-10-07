package impl;

import functionalinterfaces.IPrintable;

public class PrintableImpl {
    public static void main(String[] args) {
        IPrintable<String> print1= System.out::println;
        print1.print("sayaji");

    }
}
