import java.util.Scanner;

class Student {
    String usn, name, branch;
    int sem;

    Student(String usn, String name, String branch, int sem) {
        this.usn = usn;
        this.name = name;
        this.branch = branch;
        this.sem = sem;
    }

    void display() {
        System.out.println("USN     : " + usn);
        System.out.println("Name    : " + name);
        System.out.println("Branch  : " + branch);
        System.out.println("Semester: " + sem);
        System.out.println("-------------------------");
    }
}

public class StudentManagement {
    static Student[] students = new Student[100];
    static int count = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n====== Student Management ======");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // flush newline

            switch (choice) {
                case 1: addStudent(); break;
                case 2: viewStudents(); break;
                case 3: searchStudent(); break;
                case 4: deleteStudent(); break;
                case 5: System.out.println("Thank you! Exiting..."); break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }

    // 1. Add
    static void addStudent() {
        System.out.print("Enter USN: ");
        String usn = sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Branch: ");
        String branch = sc.nextLine();
        System.out.print("Enter Semester: ");
        int sem = sc.nextInt();
        sc.nextLine();

        students[count++] = new Student(usn, name, branch, sem);
        System.out.println("✔ Student added successfully.");
    }
