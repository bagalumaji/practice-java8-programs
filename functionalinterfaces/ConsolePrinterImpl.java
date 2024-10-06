package functionalinterfaces;

public class ConsolePrinterImpl implements IPrint{
    @Override
    public void print() {
        System.out.println("hello world");
    }
}
