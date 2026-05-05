import java.util.*;
public class Itinerary {
    public static String getStart(HashMap<String, String>map){
        HashMap<String , String > revMap = new HashMap<>(); // this map stores: "to" -> "from"
        for(String key:map.keySet()){
            revMap.put(map.get(key),key); // put value present at that key first and then put key
        }

        for(String key:map.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String args[]){
        HashMap<String, String> map = new HashMap<>();
        map.put("chennai","bengluru");
        map.put("mumbai","delhi");
        map.put("goa","chennai");
        map.put("delhi","goa");

        String start = getStart(map);
        System.out.println(start);
        for(String key : map.keySet()){
            System.out.println("->"+map.get(start));
            start = map.get(start);
        }
        System.out.println();

    }
}
