import java.util.*;
public class Linearsearch {
    public static int linear(int arr[],int key){
        for(int i=0;i<arr.length;i++){//traversing on array
            if(arr[i] == key){
                return i;
            }
       
    }
    return -1 ;
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int arr[]={1,2,3,4,5};
        System.out.print("enter key to search:");
        int key = sc.nextInt();
        sc.close();
        int index = linear(arr, key);
        if(index != -1){
            System.out.println("element found at index:"+index);

        }else{
            System.out.println("element not found");
        }
    }
    
}
