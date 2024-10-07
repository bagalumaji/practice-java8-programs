package functionalinterfaces;

@FunctionalInterface
public interface IPrintable<T> {
    void print(T t);
}
