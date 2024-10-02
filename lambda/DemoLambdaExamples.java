package lambda;

import java.util.function.Predicate;

public final class DemoLambdaExamples {
    public static void main(String[] args) {
        int num = 10;
        Predicate<Integer> evenFunction = x -> x % 2 == 0;
        Predicate<Integer> oddFunction = x -> x % 2 == 1;
        System.out.println(evenFunction.test(num));
        System.out.println(oddFunction.test(num));
    }
}
