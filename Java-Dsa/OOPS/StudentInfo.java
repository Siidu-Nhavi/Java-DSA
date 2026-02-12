import java.util.Scanner;

public class StudentInfo {
    String name;
    int rollNo;
    int marks;

    // Constructor
    public StudentInfo(String n, int rno, int marks) {
        this.name = n;
        this.rollNo = rno;
        this.marks = marks;
    }

    // Method to display student details
    public void display() {
        System.out.println("The name of student is: " + name);
        System.out.println("The roll number is: " + rollNo);
        System.out.println("Marks of student: " + marks);
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StudentInfo[] students = new StudentInfo[5];

        // Input student data
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter name, roll number, and marks for student " + (i + 1) + ":");
            String name = sc.next();
            int rollNo = sc.nextInt();
            int marks = sc.nextInt();
            students[i] = new StudentInfo(name, rollNo, marks);
        }

        // Display student data
        for (int i = 0; i < students.length; i++) {
            students[i].display();
        }

        sc.close();
    }
}
