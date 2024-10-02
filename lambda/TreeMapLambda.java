package lambda;

import comparator.SortIntegerInDescendingOrder;

import java.util.Map;
import java.util.TreeMap;

public final class TreeMapLambda {
    public static void main(String[] args) {
        // add keys in ascending order by default
        Map<Integer,String > map1 = new TreeMap<>();
        map1.put(3, "three");
        map1.put(1, "one");
        map1.put(4, "four");
        map1.put(2, "two");
        System.out.println("map1 = " + map1);

        //using lambda
        Map<Integer,String > map2 = new TreeMap<>((a,b)->b-a);
        map2.put(3, "three");
        map2.put(1, "one");
        map2.put(4, "four");
        map2.put(2, "two");
        System.out.println("map2 = " + map2);

        //old way
        Map<Integer,String > map3 = new TreeMap<>(new SortIntegerInDescendingOrder());
        map3.put(3, "three");
        map3.put(1, "one");
        map3.put(4, "four");
        map3.put(2, "two");
        System.out.println("map3 = " + map3);
    }
}
