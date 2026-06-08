import java.util.*;

public class BottomViewOfBinaryTree {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    static class Pair {
        Node node;
        int hd;

        Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd; // horizontal distance
        }
    }

    ArrayList<Integer> bottomView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        Queue<Pair> q = new LinkedList<>();

        int minHD = 0;
        int maxHD = 0;

        q.add(new Pair(root, 0)); // initally root node and horizontal distance is added

        while (!q.isEmpty()) {
            Pair curr = q.remove();
            Node node = curr.node;
            int hd = curr.hd;

            // overwrite to keep the bottommost node's
            map.put(hd, node.data);

            minHD = Math.min(minHD, hd);
            maxHD = Math.max(maxHD, hd);

            if (node.left != null) {
                q.add(new Pair(node.left, hd-1));
            }
            if (node.right != null) {
                q.add(new Pair(node.right, hd+1));
            }

        }

        for (int i = minHD; i <= maxHD; i++) {
            ans.add(map.get(i));
        }
        return ans;
    }

    public static void main(String[] args) {

        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);

        root.left.left = new Node(5);
        root.left.right = new Node(3);

        root.right.right = new Node(25);

        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);

        BottomViewOfBinaryTree b = new BottomViewOfBinaryTree();

        System.out.println(b.bottomView(root));
    }

}
