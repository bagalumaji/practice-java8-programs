package lambda;
public class Demo{
public static void main(String[]args){
    Employee employee = ()->"SAYAJI";
    System.out.println(employee.getName());
}
}

interface Employee{
    String getName();
}