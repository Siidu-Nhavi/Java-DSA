public class Inheritace {
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eat();
        shark.breathe();
        shark.swim();
    }
}
//base class
class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }

    void breathe(){
        System.out.println("Breaths");
    }
}
// derived class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swims in water");
    }
}
