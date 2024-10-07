package functionalinterfaces;

@FunctionalInterface
public interface MyInterface<T,U,R> {
    R display(T str1,U str2);
}
