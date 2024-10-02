package comparator;

import java.util.Comparator;

public final class SortIntegerInDescendingOrder implements Comparator<Integer> {
    public int compare(Integer a, Integer b) {
        return b - a;
    }
}
