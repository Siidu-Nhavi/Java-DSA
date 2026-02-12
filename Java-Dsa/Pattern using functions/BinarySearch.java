public class BinarySearch {
    public static int binary_search(int arr[],int key){
        int st =0;
        int end =arr.length-1;

        while(st <= end){
        int mid = st +(end - st)/2;
        if(arr[mid] == key){//found
           return mid;
        }else if(arr[mid] < key){//right me 
            st = mid+1;
        }else{//left me
            end = mid-1;
        }

    }
    return -1;
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10,12,14};
        int key = 4;
        int index = binary_search(arr, key);
        if(index != -1){
            System.out.println("element found at index :"+index);
        }else{
            System.out.println("element not found");
        }
    }
    
}
