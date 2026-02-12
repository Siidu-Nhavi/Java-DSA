import java.util.*;
public class Vowels {
    public static void  calculate_Vowels(String str){
        int vowels = 0;
        int consonantes = 0;
        for(int i =0;i<str.length();i++){
            char ch = Character.toLowerCase(str.charAt(i)); // make it case-insensitive
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u' ){
                vowels ++;
            }else{
                consonantes++;
            }
        }
        System.out.println("the count of vowels:"+vowels);
        System.out.print("the count of consonantes:"+consonantes);
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string:");
        String str = sc.nextLine();;
        sc.close();
        calculate_Vowels(str);
    }
    
}
