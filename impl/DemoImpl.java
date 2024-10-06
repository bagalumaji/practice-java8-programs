package impl;

import functionalinterfaces.IDemo;

public class DemoImpl {
    public static void main(String[] args) {
        IDemo demo=()->System.out.println("Hello World using lambda expression");
        demo.print();
        demo.display();
        IDemo.show();
    }
}
