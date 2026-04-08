import java.util.*;

public class IterateOnHashMap {
    public static void main(String args[]){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A",30);
        map.put("B",90);
        map.put("C",30);
        map.put("D",50);
        map.put("E",80);
        map.put("F",90);

        //iterate on the map
        Set<String> k = map.keySet();
        System.out.println(k);

        //forEach to print the record
          for (String str : k) {
            System.out.println("Key="+str+",Value="+map.get(str));
          }

          System.out.println("-----------------");
          System.out.println("without iteraing ");
          Set<Map.Entry<String,Integer>> ent = map.entrySet();
          System.out.println(ent);
    }
}
