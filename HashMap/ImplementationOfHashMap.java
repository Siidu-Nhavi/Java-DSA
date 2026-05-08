import java.util.*;

public class ImplementationOfHashMap {
    static class Hashmap<K, V> {
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
        private LinkedList<Node>[] buckets;

        @SuppressWarnings("unchecked")
        public Hashmap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) {
                    return i;
                }
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node>[] oldBuck = buckets;
            N = 2 * N;
            buckets = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }
            for (LinkedList<Node> ll : oldBuck) {
                for (Node node : ll) {
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if (di != -1) {
                buckets[bi].get(di).value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }
            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if (di != -1) {
                return buckets[bi].get(di).value;
            }
            return null;
        }

        public Set<K> keySet() {
            Set<K> keys = new HashSet<>();
            for (LinkedList<Node> ll : buckets) {
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }
    }

    public static void main(String[] args) {
        Hashmap<String, Integer> map = new Hashmap<>();
        map.put("A", 100);
        map.put("B", 200);
        map.put("C", 900);

        for (String key : map.keySet()) {
            System.out.println("key: " + key + ", value: " + map.get(key));
        }
    }
}
