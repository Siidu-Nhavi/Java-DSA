public class Abstraction {	
	public static void main(String args[]){
		Animal a1 = new Dog("Dog", 12);
		a1.makeSound();
		a1.move();
		a1.display();

		System.out.println("=============");

		Animal a2 = new Cat("Cat", 2);
		a2.makeSound();
		a2.move();
		a2.display();
		
		System.out.println("============");
		
		Animal a3 = new Bird("Sparrow",12);
		a3.makeSound();
		a3.move();
		a3.display();
		
	   System.out.println("============");
	   
	   Animal a4 = new Fish("Katala",4);
	   a4.makeSound();
	   a4.move();
	   a4.display();
		
	}
}

abstract class Animal {
	String name;
	int age;
	
	// constructor to initialize common fields
	Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	// abstract methods (must be implemented)
	abstract void makeSound();
	abstract void move();
	
	// common method
	public void display(){
		System.out.println("Name of the Animal: " + name);
		System.out.println("Age of the Animal: " + age);
	}
}

class Dog extends Animal {
	Dog(String name, int age){
		super(name, age); // calling Animal's constructor
	}

	void makeSound(){
		System.out.println("Dog makes sound: bow-bow");
	}

	void move(){
		System.out.println("Dog walks");
	}
}

class Cat extends Animal {
	Cat(String name, int age){
		super(name, age);
	}

	void makeSound(){
		System.out.println("Cat makes sound: meow-meow");
	}

	void move(){
		System.out.println("Cat moves gracefully");
	}
}

class Bird extends Animal{
	Bird(String name,int age){
		super(name,age);
	}
	
	void makeSound(){
		System.out.println("Bird makes sound like chiv-vhiv");
	}
	void move(){
		System.out.println("Bird fly's in the air");
		
	}
}

class Fish extends Animal{
	Fish(String name,int age){
		super(name,age);
	}
	
	void makeSound(){
		System.out.println("Fish make sound");
	}
	void move(){
		System.out.println("Fish swims inside the water");
	}
}