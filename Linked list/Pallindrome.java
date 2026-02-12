public class Pallindrome{
         public static void bintodecimal(int n){
            int pow =0;
            int decimal =0;
            while(n>0){
                int lastdigit = n%10;
                decimal = decimal+(lastdigit*(int)Math.pow(2,pow));
                pow++;
                n = n/10;
            }
            System.out.print(decimal);
         }
    public static void main(String args[]){
     bintodecimal(1010000000);
       
    }
}