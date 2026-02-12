public class RemoveElement{
    public static int removeElement(int arr[]){
        int n = arr.length;
        if(n==0 || n==1){
            return n;
        }
        int j=1;
        for(int i=1;i<n;i++){
            if(arr[i] != arr[i-1]){
                arr[j] = arr[i];
                j++;
            }  
        }
        return j;
    }
    public static void main(String args[]){
        int arr[] = {0,1,1,1,2,2,3,3,4};
        // Set<Integer>set = new HashSet<>();
        // for(int i=0;i<arr.length;i++){
        //     set.add(arr[i]);
        // }
        // System.out.println(set);

        int k = removeElement(arr);
        System.out.println("No of Unique Elements are:"+k);

        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }

    }
}