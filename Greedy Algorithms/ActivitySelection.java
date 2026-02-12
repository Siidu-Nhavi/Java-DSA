import java.util.*;

public class ActivitySelection {
    public static void main(String args[]) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        // in case of start and are not sorted
        int activities[][] = new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0] =i;
            activities[i][1] =start[i];
            activities[i][2] = end[i];
        }
        //by using lambda function 
        Arrays.sort(activities,Comparator.comparingDouble(o -> o[2])); // sorting based on the column no 2 i.e completion time

        // end time ke basis pe sorted hai
        int maxAct = 1;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0); // because always first activity is selected

        int lastEnd = end[0];

        for (int i = 1; i < end.length; i++) {
            if (start[i] >= lastEnd) {
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }

        System.out.print("Max Activity = " + maxAct + "\n");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}
