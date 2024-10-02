package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 1, 4, 5, 6, 3);
        sortUsingLambda(list);
    }

    public static void sortUsingLambda(List<Integer> list) {
        Collections.sort(list,(a, b) -> b - a);
        System.out.println(list);
    }

    public static void sortList(List<Integer> list) {
        Collections.sort(list);
        System.out.println(list);
    }

    public static void sortListInDescendingOrder(List<Integer> list) {
        Collections.sort(list, new ComparatorImpl());
        System.out.println(list);
    }
}

class ComparatorImpl implements Comparator<Integer> {
    public int compare(Integer a, Integer b) {
        return b - a;
    }
}