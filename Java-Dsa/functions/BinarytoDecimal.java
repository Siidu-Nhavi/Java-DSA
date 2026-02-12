public class BinarytoDecimal {
    public static void convert(int n){
    
        int decimal=0;
        int pow=0;
        while(n>0){
            int lastdigit=n%10;
            decimal=decimal+(lastdigit*(int)Maths.pow(2,pow));
            pow++;
            n=n/10;
        }
       System.out.print("decimal number is:"+decimal);
    }
    public static void main(String args[]){
        convert(101);

    }
    
}
