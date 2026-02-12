package MyPackage;

public class Demo{
	public void showMessage(){
		System.out.println("Hello from MyPackage");
	}
	
	public void greeting(){
		System.out.println("Wish you all the best for your upcoming oral exam");
	}
	
	public void calculatePow(int n,int a){
		System.out.println("The power of number is:"+Math.pow(n,a));
	}
	
	public void showAll() {
        System.out.println("Absolute: " + Math.abs(-10));
        System.out.println("Power: " + Math.pow(2, 5));
        System.out.println("Square Root: " + Math.sqrt(81));
        System.out.println("Ceil: " + Math.ceil(4.3));
        System.out.println("Floor: " + Math.floor(4.7));
        System.out.println("Max: " + Math.max(5, 10));
        System.out.println("Sin(90°): " + Math.sin(Math.toRadians(90)));
        System.out.println("Random: " + Math.random());
    }

}



    
