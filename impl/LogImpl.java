package impl;

import functionalinterfaces.ILog;

public class LogImpl {
    public static void main(String[] args) {
        //using lambda
        ILog log= str-> System.out.println(str);
        log.log("sayaji");
        //using method reference
        ILog log2= System.out::println;
        log2.log("sharu");
    }


}
