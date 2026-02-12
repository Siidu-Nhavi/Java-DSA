public class FunctionOverriding {
    public static void main(String args[]){
        Dog d1 = new Dog();
        d1.sound();//derived class output should be printed
        Animal a = new Animal();
        a.eats();
    }
    
}
class Animal{
    void sound(){
        System.out.println("the sound is good");
    }
    void eats(){
        System.out.println("Animal eats");
    }
}

class Dog extends Animal{
    // @@Override
    void sound(){
        System.out.println("the sound was funtastic");
    }
    void eats(){
        System.out.println("dog eats");
    }
}