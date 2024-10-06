package impl;

import functionalinterfaces.IAddition;

public final class AdditionImpl {
    public static void main(String[] args) {
        IAddition add = (a, b)->a+b;
        System.out.println(add.add(11,22));
    }
}
