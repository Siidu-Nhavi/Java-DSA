public class Abstraction {
    public static void main(String args[]){
        Dog d1 = new Dog();
        d1.eats();
        d1.sum(10,19);
        
    }
    
}

abstract class Animal{

    abstract public void eats();
    abstract public void sleep();

    public  int sum(int a,int b){
        return a+b;
    }
        
    
}

class Dog extends Animal{
    public void eats(){
        System.out.print("Dog eats");
    }
    public void sleep(){
        System.out.print("Dog sleep");
    }

}
