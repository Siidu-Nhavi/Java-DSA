import java.util.*;
public class InstanceConstrucor{
	public static void main(String args[]){
	System.out.println("=======The details of 1st car ========");
	Car c1 = new Car("Maruti suzuki","Thar","white",10.500);
	c1.Display();
	System.out.println("=======The details of 2nd car ========");
	c1.setName("bmw");
	c1.setBrand("Mercedies");
	c1.setColor("Red");
	c1.setPrice(100.5678);
	c1.Display();
	
	}

}

class Car{
	String name;
	String brand;
	String color;
	double price;
	
	public Car(String n, String b,String c,double p){
		this.name = n;
		this.brand = b;
		this.color = c;
		this.price = p;
	
	}
	
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setBrand(String brand){
		this.brand = brand;
		
	}
	public String getBrand(){
		return brand;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setPrice(double p){
		this.price = p;
		
	}
	
	public double getPrice(){
		return price;
	}
	
	public void Display(){
		System.out.println("Name of Car is:"+this.name);
		System.out.println("The brand of car is :"+this.brand);
		System.out.println("The color of car is:"+this.color);
		System.out.println("The price of car is:"+this.price);
	}
}