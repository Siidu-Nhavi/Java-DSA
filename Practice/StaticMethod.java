class Counter {
	public static int count = 0;
	Counter(){
		count++;
		System.out.println("object created count"+count);
	}
	static void showTotalCount(){
		System.out.println("Total count is:"+count);
	}
}

public class StaticMethod{
	public static void main(String args[]){
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		
	}
}
	
