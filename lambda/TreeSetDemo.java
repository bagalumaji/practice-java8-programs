package lambda;

import comparator.SortIntegerInDescendingOrder;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        // adding in ascending order
        Set<Integer> set1 = new TreeSet<>();
        set1.add(11);
        set1.add(2);
        set1.add(31);
        System.out.println("set1 = " + set1);

        // adding in descending order using custom comparator
        Set<Integer> set2 = new TreeSet<>(new SortIntegerInDescendingOrder());
        set2.add(11);
        set2.add(2);
        set2.add(31);

        System.out.println("set2 = " + set2);

        // adding using lambda-comparator
        Set<Integer> set3 = new TreeSet<>((a,b)->b-a);
        set3.add(11);
        set3.add(2);
        set3.add(31);
        System.out.println("set3 = " + set3);

    }
}
