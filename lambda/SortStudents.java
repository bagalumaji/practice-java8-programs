package lambda;

import entities.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class SortStudents {
    public static void main(String[] args) {
        Student s1 = new Student(2, "sayaji");
        Student s2 = new Student(1, "sharu");
        Student s3 = new Student(3, "bagal");
        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        System.out.println("students = " + students);
        students.sort((a,b)->b.getId()-a.getId());
        System.out.println("students in descending order using id= " + students);
        students.sort((a,b)->b.getName().compareToIgnoreCase(a.getName()));
        System.out.println("students in ascending order using name= " + students);
        students.sort(Comparator.comparingInt(Student::getId));
        System.out.println("students in ascending order using id= " + students);
        students.sort((x,y)-> x.getName().compareToIgnoreCase(y.getName()));
        System.out.println("students in descending order using name= " + students);
    }
}
