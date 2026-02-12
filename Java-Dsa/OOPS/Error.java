public class Error {
    public static void main(String wheels){
        final Car car = new ElectricCar();
        System.out.print(car.drive());
    }
    
}

class Automobile{
    private String drive(){
        return "driving vehicle";
    }
}

class Car extends Automobile{
    protected String drive(){
        return "driving car";
    }
}

public class ElectricCar extends Car{
    public final String drive(){
        return "Driving electric car";
    }
}

