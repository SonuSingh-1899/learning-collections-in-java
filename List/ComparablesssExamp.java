package List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    int rollno;
    String name;
    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    @Override
    public String toString() {
        return "rollno : "+rollno+" name : "+name;
    }
    @Override
    public int compareTo(Student o) {
        return this.rollno - o.rollno;
    }    
}

public class ComparablesssExamp  {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(22, "Sonu"));
        students.add(new Student(12, "vikas"));
        students.add(new Student(19, "shubham"));
        students.add(new Student(33, "viajay"));
        students.add(new Student(45, "mohan"));
        System.out.println("befor sorting :: ");
        for(Student s : students) {
            System.out.println(
                "Roll No : " + s.rollno +
                " | Name : " + s.name
            );
        }

        Collections.sort(students);
        System.out.println();
        System.out.println();
        System.out.println();
        for(Student s : students) {
            System.out.println(
                "Roll No : " + s.rollno +
                " | Name : " + s.name
            );
        }
    }
}
