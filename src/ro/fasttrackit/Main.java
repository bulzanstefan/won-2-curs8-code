package ro.fasttrackit;

import ro.fasttrackit.curs8.Classroom;
import ro.fasttrackit.curs8.Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ana", 10);
        Student student2 = new Student("Ana", 10);
        Student student3 = new Student("Ana", 10);
        Student student4 = new Student("Ana", 10);
        moreStudenti();
        System.out.println(student1.getName());
        System.out.println(Student.getInstanceCount());


        Classroom classroom = new Classroom(11, "Primarie");
        classroom = new Classroom(12, "Primarie");

    }

    private static void moreStudenti() {
        new Student("Ana", 10);
        new Student("Ana", 10);
        new Student("Ana", 10);
        new Student("Ana", 10);
        new Student("Ana", 10);
    }
}
