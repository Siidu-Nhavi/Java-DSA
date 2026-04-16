import java.util.LinkedHashMap;
import java.util.Set;
public class LinkedHashing {
    public static void main(String args[]){
        LinkedHashMap<String , Integer>map = new LinkedHashMap<>();

        map.put("A",90);
        map.put("B",89);
        map.put("C",100);
        map.put("D",190);

        Set<String> keys = map.keySet();
        for (String str : keys ) {
            System.out.println("Key:"+str+",value:"+map.get(str));
        }
        /*
            each and every operations are same 
            and performed in same time complexity

            
            
                when to use:
                    --> when we need the data according to insertion order
            
        
        */
    }
}
