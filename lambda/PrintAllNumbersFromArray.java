package lambda;

import java.util.Arrays;
import java.util.List;

public final class PrintAllNumbersFromArray {
    public static void main(String[] args) {
        int [] numbers = {2,1,3,4,5,6,7};
        Arrays.stream(numbers).forEach(x-> System.out.print(" "+x));
        System.out.println("2");
        List<Integer> numberList = Arrays.asList(2,1,3,4,5,6,7);
        numberList.forEach(x-> System.out.print(" "+x));
    }
}
