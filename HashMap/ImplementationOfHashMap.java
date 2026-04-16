import java.util.*;

public class ImplementationOfHashMap {
    static class Hashmap<K, V> { // K,V are generic's

        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // size
        private int N; // bucket size
        private LinkedList<Node> buckets[] ;//N=bucket.size

        public void HashMap(){
            this.N =4;
            this.buckets = new LinkedList[4];

            for (int i=0;i<4;i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key, V value){
            int hc = key.hashCode(); // find the hash code
            return Math.abs(hc) % N;
        }

        private int searchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            int di=0;
            for(int i=0;i<ll.size();i++){
                Node node = ll.get(i);
                
                if(node.key == key){
                    return di;
                }
                di++;
            }
            return -1;
        }
        private void rehash(){
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[N*2];
            N=2*N;
            for(int i=0;i<buckets.length;i++){
                buckets[i] = new LinkedList<>();
            }
            //nodes ko nikalo -> aur add karo bucket mai
            for(int i=0;i<oldBuck.length;i++){
                LinkedList<Node> ll = oldBuck[i];
                for(int j=0;j<ll.size();j++){
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }
        public void put(K key , V value){
            int bi = hashFunction(key,value);
            int di = searchInLL(key, bi);
            if(di != -1){
                Node node = buckets[bi].get(di);
                node.value = value;
            }else{
                buckets[bi].add(new Node(key,value));
                n++;
            }
            double lambda = (double) n/N;
            if(lambda > 2.0){
                rehash();
            }
        }


    }

    public static void main(String args[]) {
        HashMap<String,Integer>map = new HashMap<>();
        map.put("A",100);
        map.put("B",200);
        map.put("C",900);
        Set<String> keys = map.keySet();
        for (String str : keys) {
            System.out.println("key:"+str+",value:"+map.get(str));
        }
    }
}