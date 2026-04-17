import java.util.*;
public class Hashset {
    public static void main(String args[]){
        HashSet<String> set = new HashSet<>();
        set.add("mumbai");
        set.add("pune");
        set.add("nagar");
        set.add("sangli");
        
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        set.remove("pune");
        set.clear();
        System.out.print("the size of set="+set.size());

    }
}
