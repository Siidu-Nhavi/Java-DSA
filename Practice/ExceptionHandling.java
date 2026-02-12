public class ExceptionHandling{
	public static void main(String args[]){
		try{
			int a=10,b=0;
			int result = a/b;
			System.out.println("Result="+result);
			try{
				int[] arr = {0,1,2,3,4};
				System.out.println("index:"+arr[6]);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("invalid index="+e);
			}
		}catch(ArithmeticException e){
			System.out.println("division by zero is not possible:"+e);
		}finally{
			System.out.println("Finally block is executed");
		}
	}
}