import java.util.*;
public class Stringbasic {

    //function to print the index of the string
    public static void printLetters(String str){
        int n= str.length();
        for(int i=0;i<n;i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){

    // Scanner sc = new Scanner(System.in);
    // String str = "abc";//simple initializaion
    // String str1 = new String("hi ,how are you");//taking input from using new keyword
    // System.out.println(str);
    // System.out.println(str1);
    

    //taking input from user
    // System.out.print("enter name:");
    // String name = sc.next();//takes only input without space 
    // System.out.println(name);

    // //if we want to take input by allowing space and characters
    // String name1 = sc.nextLine();
    // System.out.println("your name is:"+name1);
    

    //calculating the length of string
        
    String name3 = "Ritesh Khade";
    System.out.println("the length of string is:"+name3.length());
    printLetters(name3);//printing the index of the string

    System.out.println("the character at the index is:"+name3.charAt(0));//for printing the specific index

 }
    
}
