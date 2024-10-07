package impl;

import functionalinterfaces.MyInterface;

public class MyInterfaceImpl {
    public static void main(String[] args) {
        MyInterface<String,String,String> myInterface = (str1, str2) -> str1 + str2;
        System.out.println(myInterface.display("sharu", " bagal"));
    }
}
