import java.util.*;
public class Swap {
    public static void swap(ArrayList<Integer>list,int idex1,int idex2){
        int temp = list.get(idex1);
        list.set(idex1,list.get(idex2));
        list.set(idex2,temp);

    }
    public static void main(String args[]){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println(list+" ");
        int idex1 =2,idex2 = 3;
        swap(list,idex1,idex2);
        System.out.print(list+" ");
    }
    
}
