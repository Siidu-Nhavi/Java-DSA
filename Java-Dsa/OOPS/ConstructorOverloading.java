public class ConstructorOverloading {
    public static void main(String args[]) {
        Car c1 = new Car("maruti suzuki", 1999, 2l);
        System.out.println("the name of the car is:" + c1.name);
        System.out.println("the price of car is:" + c1.price);

        Car c2 = new Car("BMW");
        System.out.println("the name of car is:" + c2.name);

        Car c3 = new Car(300000, 20);
        System.out.println("the price of car is:" + c3.price);
        System.out.println("the milage of car is:" + c3.milage);

    }

}

class Car {
    public String name;
    int model;
    float price;
    int milage;

    Car(String name, int model, float price) {
        this.name = name;
        this.model = model;
        this.price = price;

    }

    Car(String name) {
        this.name = name;
    }

    Car(float price, int milage) {
        this.price = price;
        this.milage = milage;
    }
}
