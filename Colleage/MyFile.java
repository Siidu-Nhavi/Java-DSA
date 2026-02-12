import java.util.*;
import java.io.*;
public class MyFile{
	public static void main(String args[]){
		try{
		FileInputStream fin = new FileInputStream("input.txt");
		FileOutputStream fos = new FileOutputStream("output.txt");
		
		int data ;
		while((data = fin.read()) != -1){
			fos.write();
			
		}
		fin.close();
		fos.close();
		System.out.println("The input file is copied into output file");
		
		}catch(FileNotFoundException e){
			System.out.println("File not found exception:"+e);
		}finally{
			System.out.println("Finally block is executed......");
		}
	}
}