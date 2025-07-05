package CollectionAndStreamAPI.ListInterface;

import java.util.ArrayList;
import java.util.List;

class Student {

    private final String name;
    private final double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }
}
public class StudentLambda {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Reetej", 3.5));
        students.add(new Student("Jeeya", 3.7));
        students.add(new Student("Kuhu", 3.5));
        students.add(new Student("Anil", 3.9));
        students.sort((o1, o2) -> {

            if (o2.getGpa() - o1.getGpa() > 0) {
                return 1;
            } else if (o2.getGpa() - o1.getGpa() < 0) {
                return -1;
            } else {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Student s : students) {
            System.out.println(s.getName() + " : " + s.getGpa());
        }
    }
}
