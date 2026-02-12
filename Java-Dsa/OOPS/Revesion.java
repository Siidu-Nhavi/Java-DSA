public class Revesion {

    public static boolean isSorted(int arr[],int i){
        if(i == arr.length){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }

        return isSorted(arr, i+1);
    }


    public static boolean isprime(int n){
        if(n < 2) return false; // handling 0 and 1
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static int PrintPrime(int n){
        int count =0;
        for(int i=2;i<=n;i++){
            if(isprime(i)){
                System.out.println(i+" ");
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
       System.out.println("the total count of prime numbers in the range :"+PrintPrime(10));
       int arr[] ={1,2,3,4,5};
       System.out.println(isSorted(arr, 0));
        
           
        }
    }
    

