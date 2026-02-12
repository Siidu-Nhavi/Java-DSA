public class Static {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.setName("King");
        s1.getName();
        System.out.println("the number of objects created are:"+Student.objectCount);



    }
    
}

class Student{

    static int objectCount = 0;
    String name;
    int rollno;

    static String schoolName;

    Student(){
        objectCount++;
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}
