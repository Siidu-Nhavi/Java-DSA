public class Abstraction {
    public static void main(String args[]){
        Horse h1 = new Horse();
        h1.changecolor();
     
    }
    
}

abstract class Animal{

    String color;
    
    // Animal(){
    //     color = "brown";
    // }
    Animal(){
        System.out.println("the Animal constructor is called");
    }


    // non-abstract funcion 
    void eat(){
        System.out.println("the animal eats");
    }

    abstract void walk();
}
class Horse extends Animal{
    
    Horse(){
        System.out.println("the horse constructor is called");
    }
    void changecolor(){
        color = "white";
    }
    void walk(){
        System.out.println("the horse walks on 4 legs");
    }
}
class Chicken extends Horse{

    Chicken(){
        System.out.println("the chicken costructor is calles");
    }
    void changecolor(){
        color = "yellow";
    }
    void walk(){
        System.out.println("chicken walks on 2 leg's");
    }
}
