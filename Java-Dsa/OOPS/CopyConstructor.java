
public class CopyConstructor {
    public static void main(String args[]){
        Student s1 = new Student("siddu","cse",237);
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 100;

        Student s2 = new Student(s1);
        s1.marks[0] = 90;
        s1.marks[1] = 80;
        s1.marks[2] = 100;
        System.out.println(s2.name);
    

        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }

    }
    
}

class Student{
    public 
    String name;
    String dept;
    int rollno;
    int marks[] = new int[3];

    //shallow copy constructor
    // Student(Student s1){
    //     this.marks = new int[3];
    //     this.name = s1.name;
    //     this.dept = s1.dept;
    //     this.rollno = s1.rollno;
    //     this.marks = s1.marks;


    // }

    //deep copy constructor 
    
    Student(Student s1){
        this.marks = new int[3];
        this.name = s1.name;
        this.dept = s1.dept;
        this.rollno = s1.rollno;

        for(int i=0;i<marks.length;i++){
            this.marks[i] = s1.marks[i];
        }
    }

    Student (String name,String dept,int rollno){
        marks = new int[3];
        this.name = name;
        this.dept = dept;
        this.rollno = rollno;
  
    }

}
