package JaVaProject;

import java.util.*;

class StudentManage {
    int rollNo;
    String name;
    int age;
    String course;

    public StudentManage(int rollNo, String name, int age, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Age: " + age + ", Course: " + course);
    }
}

public class StudentRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<StudentManage> students = new ArrayList<>();

        while (true) {
            System.out.println("\n==== Student Management System ====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by Roll No");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    sc.nextLine(); // consume \n
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();
                    students.add(new StudentManage(roll, name, age, course));
                    System.out.println("Student added successfully.");
                }

                case 2 -> {
                    System.out.println("\n--- Student List ---");
                    for (StudentManage s : students) {
                        s.display();
                    }
                }

                case 3 -> {
                    System.out.print("Enter Roll No to search: ");
                    int searchRoll = sc.nextInt();
                    boolean found = false;
                    for (StudentManage s : students) {
                        if (s.rollNo == searchRoll) {
                            s.display();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found.");
                    }
                }

                case 4 -> {
                    System.out.print("Enter Roll No to update: ");
                    int updateRoll = sc.nextInt();
                    boolean updated = false;
                    for (StudentManage s : students) {
                        if (s.rollNo == updateRoll) {
                            sc.nextLine();
                            System.out.print("Enter New Name: ");
                            s.name = sc.nextLine();
                            System.out.print("Enter New Age: ");
                            s.age = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Enter New Course: ");
                            s.course = sc.nextLine();
                            updated = true;
                            System.out.println("Student updated.");
                            break;
                        }
                    }
                    if (!updated) {
                        System.out.println("Student not found.");
                    }
                }

                case 5 -> {
                    System.out.print("Enter Roll No to delete: ");
                    int deleteRoll = sc.nextInt();
                    Iterator<StudentManage> itr = students.iterator();
                    boolean deleted = false;
                    while (itr.hasNext()) {
                        if (itr.next().rollNo == deleteRoll) {
                            itr.remove();
                            deleted = true;
                            System.out.println("Student deleted.");
                            break;
                        }
                    }
                    if (!deleted) {
                        System.out.println("Student not found.");
                    }
                }

                case 6 -> {
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
