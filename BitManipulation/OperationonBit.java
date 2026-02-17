public class OperationonBit {
    public static int GetithBit(int n, int i) {
        int BitMask = (1 << i);
        if ((n & BitMask) == 0) {
            return 0;

        } else {
            return 1;
        }
    }

// changing an bits if it is 1 -> 0 && 0 -> 1 vice-versa

    public static int set_Ith_bit(int num, int i) {
        int BitMask = (1 << i);
        return num | BitMask;
    }

    public static int clear_Ith_bit(int num, int i) {
        int BitMask = ~(1 << i);//~0 is also working
        return num & BitMask;
    }

    public static int update_Ithbit(int n, int i, int newBit) {
        if (newBit == 0) {
            return clear_Ith_bit(n, i);
        } else {
            return set_Ith_bit(n, i);
        }
    }

    public static int clear_range_ofBits(int n, int i, int j) {
        int a = ((~0) << j + 1);
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    // check if no is power of two or not 
    public static boolean Check_Power_OFTwo(int n) {
        return ((n & n - 1) == 0);
    }

    // counting set bits in given number
    public static int countSetbits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {// check our LSB
                count++;// increment count according to their occurance
            }
            n = n >> 1; // shifting or reducing bits to avoid repetiability 
        }
        return count;
    }
    public static int FastExponentiation(int a,int n){
        int  ans = 1;
        
        while( n > 0){
            if((n & 1) != 0){//check our LSB
            ans*= a;
        }
        a = a*a;
        n = n >> 1;
    }
    return ans;
    }
    public static int modularExponetiation(int a,int n,int m){
        int ans = 1;
        a = a % m ; // if a is larger than m

        while( n > 0){
            if((n & 1 ) != 0){
                ans = (ans * a) % m ;

            }
            a*=a%m;
            n=n>>1%m;
        }
        return ans;
    }

    public static boolean powerof_three(int n){
        if(n < 1) return false;
        while(n % 3 == 0){
            n /= 3;
        }
        return n == 1;
    }
    public static void main(String args[]) {
        // System.out.println(GetithBit(10, 2));
        // System.out.println("the set ith bit is:"+set_Ith_bit(10, 2));
        // System.out.println("cleared ith bit is:"+clear_Ith_bit(10, 3));
        // System.out.println("the bit after changing/ updation is:"+update_Ithbit(10,
        // 4, 1));
        // System.out.println("the bits after cleared :"+clear_range_ofBits(21, 2, 4));
        // System.out.println("the number is power of two:"+Check_Power_OFTwo(8));
        // System.out.println("the set bits in given number is:" + countSetbits(1034));
        // System.out.println("the Fast Exponatiation is:"+FastExponentiation(6, 4));
        //System.out.println("the modular exponatiation is:"+modularExponetiation(19, 0, 4));
        System.out.println("the power of three is:"+powerof_three(27));//true
    }

}
