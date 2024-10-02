package lambda;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(5);
        set1.add(3);
        set1.add(2);
        set1.add(4);
        System.out.println("set1 = " + set1);
        set1.stream().sorted((a, b) -> b - a).forEach(System.out::println);
    }
}
