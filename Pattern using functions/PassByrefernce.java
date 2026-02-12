import java.util.*;
public class PassByrefernce {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
             marks[i]+=1;
        }
       
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks[] = {90, 91, 92};
      
       update(marks);
       System.out.println("updated marks are:"+Arrays.toString(marks));
    }
    
}
