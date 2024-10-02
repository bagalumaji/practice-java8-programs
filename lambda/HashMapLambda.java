package lambda;

import java.util.Map;
import java.util.TreeMap;

public final class HashMapLambda {
    public static void main(String[] args) {
        Map<Integer, String> map2 = new TreeMap<>();
        map2.put(3, "three");
        map2.put(1, "one");
        map2.put(4, "four");
        map2.put(2, "two");
        System.out.println("map2 = " + map2);

        map2
                .entrySet()
                .stream()
                .sorted((a, b) -> b.getKey() - a.getKey())
                .forEach(System.out::println);
    }
}
