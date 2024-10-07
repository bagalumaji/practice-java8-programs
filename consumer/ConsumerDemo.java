package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("sayaji", "sharu", "bagal");

        //foreach - accept the consumer interface

        Consumer<String> con = str->System.out.println(str);
        Consumer<String> con1 = System.out::println;
        list.forEach(con);
        list.forEach(con1);
        list.forEach(System.out::println);
        list.forEach(con1.andThen(str->System.out.println(str.toUpperCase())));
    }
}
