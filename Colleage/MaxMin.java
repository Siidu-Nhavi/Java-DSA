public class MaxMin {
    static int count;
    static void print(){
        System.out.print("Good morning");
    }
    static {
        System.out.println("king is coming");
    }
    public static void main(String args[]){
        int arr[] ={1,2,3,4,5};
        int max = arr[0];
        int min = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i] > i){
                max = arr[i];
            }else{
                min = arr[i];
                
            }
            count++;
        }
        System.out.println("Min:"+min+"\n"+"Max:"+max);
        System.out.println("count="+count);
        print();
    }
    
}
