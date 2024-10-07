package impl;

import java.util.function.Consumer;

public class TestRunner {
    public static void main(String[] args) {
        String str1 = "Sayaji";
//        toUpperCase(str);
        Consumer<String> toUpper = str -> System.out.println(str.toUpperCase());
        stringOperation(str1, toUpper);
        stringOperation(str1, str -> System.out.println(str.length()));
    }

    static void toUpperCase(String str) {
        System.out.println(str.toUpperCase());
    }

    static void stringOperation(String str, Consumer<String> consumer) {
        consumer.accept(str);
    }
}
