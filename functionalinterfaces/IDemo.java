package functionalinterfaces;

@FunctionalInterface
public interface IDemo {
    void print();
    static void show(){
        System.out.println("Hello World from show" );
    }
    default void display(){
        System.out.println("Hello World from display" );
    }
}
