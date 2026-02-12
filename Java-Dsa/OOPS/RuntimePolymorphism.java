public class RuntimePolymorphism {
    public static void main(String args[]){
        deer d1 = new deer();
        d1.eat();//eat grass

        Action a1 = new Action();
        a1.add();//-2


    }
    
}

class Animal{
    void eat(){
        System.out.println("eats everything");
    }
}
class deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}

// next 

class Arithmatics{
    int a=10;
    int b = 12;
    int add(int a, int b){
        return a+b;
    }
}
class Action extends Arithmatics{
  
    void add(){
        System.out.println(a-b);
    }
}
