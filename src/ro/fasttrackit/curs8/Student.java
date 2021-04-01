package ro.fasttrackit.curs8;

public class Student {
    private static int INSTANCE_COUNT = 0;
    private final String name;
    private final int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        INSTANCE_COUNT++;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public static int getInstanceCount() {
        return INSTANCE_COUNT;
    }
}
