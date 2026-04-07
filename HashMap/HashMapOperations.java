import java.util.HashMap;

public class HashMapOperations {
    public static void main(String args[]){
        HashMap<String , Integer> map = new HashMap<>();
      
        // insertion in the hash map O(1)
        map.put("india",100);
        map.put("china",132);
        map.put("canada",343);

        System.out.println(map);

        
        // Get i.e retrival O(1)
        int population = map.get("china");
        System.out.println("The Value at key is:"+population);
        
        //Contains key i.e for to check is the key is present in the map O(1) && returns the boolean value
        
        System.out.println("The key is present:"+map.containsKey("china"));
        System.out.println(map.containsKey("indonesia"));

        //remove 
        //remove the value present at that key  
        System.out.println("removed:"+map.remove("india"));

        System.out.println("The map is:"+map);

        //calculate the size of map
        System.out.println("The size of map is:"+map.size());

        //check is it map is empty
        System.out.println("The map is Empty:"+map.isEmpty());

        //clear the map
        map.clear();

        System.out.println("-----After clearing------");

         System.out.println("The map is Empty:"+map.isEmpty());

         System.out.println("Updated map is:"+map);

        


        
    }
    
}
