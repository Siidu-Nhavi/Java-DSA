public class Encapsulation {
    public static void main(String args[]){
        Student s1 = new Student();
        System.out.println(s1.getrollno());
        s1.setrollno(10);
        System.out.println("the updated roll no is:"+s1.getrollno());

    }
    
}
class Student{
    private

    int rollno = 237;

    public
    String name ="siddu";
    int age = 19;
    String branch = "cse";

    int  getrollno(){ //method
        return rollno;
    }
    // to access private property we are going through getter and setters
    void  setrollno(int newrollno){ //method
       this.rollno = newrollno;
       
    }


}
