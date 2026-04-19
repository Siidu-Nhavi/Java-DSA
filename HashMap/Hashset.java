import java.util.*;
public class Hashset {
    public static void main(String args[]){
        HashSet<String> set = new HashSet<>();
        set.add("mumbai");
        set.add("pune");
        set.add("nagar");
        set.add("sangli");
        
        while(set.iterator().hasNext()){
            System.out.println( set.iterator().next());
        }
        set.remove("pune");
        set.clear();
        System.out.print("the size of set="+set.size());

    }
}
