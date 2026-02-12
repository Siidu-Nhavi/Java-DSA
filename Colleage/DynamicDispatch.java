public class DynamicDispatch {
    public static void main(String args[]){
        Vehicle v = new Car();
        v.start();
        v.stop();
        System.out.println("--------------------------------");
        Vehicle v1 = new Bike();
        v1.start();
        v1.stop();
    }
    
}

interface Vehicle{
    void start();
    default void stop(){
        System.out.println("Vehicle stops");
    }
}

class Car implements Vehicle{
    public void start(){
        System.out.println("Car starts");
    }

    public void stop(){
        System.out.println("Car stops");
    }
}

class Bike implements Vehicle{
     public void start(){
        System.out.println("Bike  starts");
    }

    public void stop(){
        System.out.println("Bike stops");
    }
}
