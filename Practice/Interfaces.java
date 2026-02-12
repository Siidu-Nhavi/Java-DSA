public class Interfaces{
	public static void main(String siddu[]){
		Vehicle v1 = new Bike();
		v1.start();
		
		System.out.println("============");
		
		Vehicle v2 = new Car();
		v2.start();
		v2.stop();
		
		System.out.println("============");
		
		Vehicle v3 = new Jeep();
		v3.start();
		v3.stop();
		
	}
	
}

interface Vehicle{
	void start();
	void stop();
}

class Bike implements Vehicle{
	public void start(){
		System.out.println("Bike starts");
	}
	public void stop(){
		System.out.println("bike stops");
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

class Jeep implements Vehicle{
	public void start(){
		System.out.println("Jeep starts");
	}
	public void stop(){
		System.out.println("Jeep stops");
	}
}