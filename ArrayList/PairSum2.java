import java.util.ArrayList;
public class PairSum2 {
  public static boolean pairSum(ArrayList<Integer> list, int target) {
    int n = list.size();
    int bp = -1; // breaking point

    // Find pivot (breaking point)
    for(int i = 0; i < n - 1; i++) { // loop only till n-1
        if(list.get(i) > list.get(i + 1)) {
            bp = i;
            break;
        }
    }

    int lp = (bp + 1) % n; // smallest element index
    int rp = bp;           // largest element index

    // Circular two-pointer search
    while(lp != rp) {
        int sum = list.get(lp) + list.get(rp);

        if(sum == target) {
            return true;
        } else if(sum < target) {
            lp = (lp + 1) % n; // move forward circularly
        } else {
            rp = (n + rp - 1) % n; // move backward circularly
        }
    }

    return false;
}

    public static void main(String arg[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.print(pairSum(list, target));
        
    }
    
}
