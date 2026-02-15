public class MergeSortedArray {
    public static void merge(int [] nums1,int m,int [] nums2, int n){
        int i=m-1,j=n-1;
        int k = m+n-1; // last position in nums1

        while(i >=0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }else{
                nums1[k--] = nums2[j--];
            }
        }

        while( j >= 0){
            nums1[k--] = nums2[j--];
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,0,0,0}; // extra space for nums2
        int m=4;
        int arr1[] ={2,3,5};
        int n=3;
        merge(arr,m,arr1,n);
        for(int i=0;i<m+n;i++){
            System.out.print(arr[i] +" ");
        }

    }
    
}
