import java.io.*;

// Serializable class
class Student implements Serializable {
    private static final long serialVersionUID = 1L; // good practice

    int roll_no;
    String name;
    String dept;
    char div;

    Student(int r, String n, String d, char di) {
        this.roll_no = r;
        this.name = n;
        this.dept = d;
        this.div = di;
    }

    public void display() {
        System.out.println("The roll number is:" + roll_no);
        System.out.println("The name of Student is:" + name);
        System.out.println("The Department of Student is:" + dept);
        System.out.println("The division of student is:" + div);
    }
}

public class SerializationDemo {
    public static void main(String args[]) {
            Student s1 = new Student(12, "siddu", "cse", 'c');

            // serialization
            try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("input.ser"));
            oos.writeObject(s1);
            System.out.println("----object is serialized---");

            }catch(Exception e){
                System.out.println("Error as:"+e);
            }

            try{
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("input.ser"));
                 Student s2 = (Student) ois.readObject();
                 System.out.println("-----Object has been deserilized-----");
                 s2.display();
            }catch(Exception e){
                System.out.println("Exception as:"+e);
            }
        }
}

// this is the process of converting object into byteStream
