public class ConcatenationOfArray {
    public static int[] concatenate(int arr1[],int arr2[]){
        int n= arr1.length;
        int n2=arr2.length;
        int ans [] = new int[n+n2];
        for(int i=0;i<n;i++){
            ans[i] = arr1[i];
        }
        for(int i=0;i<n2;i++){
            ans[i+n]=arr2[i];
        }
        return ans;

    }
    public static int [] Concat(int a[]){
        int n=a.length;
        int [] ans=new int[2*n];
        for(int i=0;i < n;i++){ 
            ans[i] = a[i]; // first copy of array is stored in ans
        }
        for(int i=0;i<n;i++){
            ans[n+i] = a[n-1-i]; // second copy in reverse order
        }
        return ans;
    }
    public static void main(String args[]){
        int A[] ={1,2,3};
        int B[]={3,2,1};
        int concat[] = concatenate(A, B);
        for(int i=0;i<concat.length;i++){
            System.out.println(i);
        }
        // System.out.println("Concatination of array is:"+Arrays.toString(concatenate(A, B))+" ");
        //  System.out.print("Concatination of array is:"+Arrays.toString(Concat(A))+" ");

    }
}
