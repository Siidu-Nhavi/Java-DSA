public class Multilevel {
    public static void main(String args[]){
       Manager m1 = new Manager();
       m1.speak();
       m1.work();
       m1.manage();

    }
    
}

class A{
    int a=5;
    int b=4;
    void add(){
        System.out.println(a+b);
    }
}
class B extends  A{
    void multiplication(){
        System.out.println(a*b);
    }
}

class C extends B{

    void diff(){
        System.out.println(a-b);
    }
}


class Person {
    void speak() {
        System.out.println("Person is speaking");
    }
}

class Employee extends Person {
    void work() {
        System.out.println("Employee is working");
    }
}

class Manager extends Employee {
    void manage() {
        System.out.println("Manager is managing the team");
    }
}
