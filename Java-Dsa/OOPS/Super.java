public class Super {
    public static void main(String args[]){
        Dog d1 = new Dog();
        System.out.println(d1.color);
    }
    
}

class Animal{
    String color;
    Animal(){
        System.out.println("the Animal construcor is called");
    }
}

class Dog extends Animal{

    
    Dog(){
        
        super();
        super.color = "brown";
        System.out.println("the dog constructor is called");
    }
}
