public class ReverseNumber {
    public static boolean reverse(int num){
        int original=num;
        int rev1=0;
        while(num > 0){
            int digit = num%10;
            rev1 =(rev1*10)+digit;
            num/=10;
        }
        
        return original == rev1;
    }
    public static void main(String args[]){
        System.out.println(reverse(1823211789));
        
    }
}
