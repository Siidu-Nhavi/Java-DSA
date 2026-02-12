//inbuilt packages
import java.lang.*;
import java.util.*;
import java.io.*; 
import java.util.ArrayList;

public class Package {
    public static void main(String args[]) throws IOException{

        FileWriter fr = new FileWriter("output.txt");
        fr.write("Good Morning..!");
        fr.close();
        System.out.println("Data Written to output.txt SuccessFully");

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your name:");
        // String name = sc.nextLine();
        // System.out.println("Your name is:"+name);

        // ArrayList<String> A = new ArrayList<>();
        // A.add("Ram");
        // A.add("Sham");
        // A.add("Radha");
        // A.add("Govind");

        // System.out.println(A+" ");
    }
}
