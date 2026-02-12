import java.util.*;
public class Basic {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[10];
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        sc.close();
        System.out.println("length of array is="+marks.length);
        System.out.println("phy="+marks[0]);
        System.out.println("chem="+marks[1]);
        System.out.println("math="+marks[2]);
        

    }
    
}
