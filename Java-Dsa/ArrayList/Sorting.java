import java.util.*;
public class Sorting {
    public static void main(String args[]){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(1);
        list.add(0);  
        System.out.println("before sorting:"+list);

        Collections.sort(list);
        System.out.println("array after sorting in ascending order:"+list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.print("array after sorting in descending order:"+list);
        
    }
    
}
