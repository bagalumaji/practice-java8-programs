package impl;

import functionalinterfaces.IPrint;

public class ConsolePrinterImpl implements IPrint {
    @Override
    public void print() {
        System.out.println("hello world");
    }
}
