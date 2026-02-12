public class Constructors {
    public static void main(String args[]){
        //Teacher t1 = new Teacher();
        Teacher t2 = new Teacher("shraddha","cse");
        System.out.println(t2.name);
    

    }
    
}

class Teacher{
    public
    String name;
    int age;
    String dept;
    String subject;

    Teacher(){
        System.out.println("hi,i am non-parameterized constructor......");
    }

    Teacher(String name,String dept){

        System.out.println("hi,parametrized constructor is called.....");
        this.name = name;
        this.dept = dept;
    }
}
