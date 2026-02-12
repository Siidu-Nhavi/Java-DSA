public class FriendPairingProblem {
    public static int makePair(int n){
        //base case
        if(n==1 || n==2){ // if friends 1 and 2 then the pairs are equal to their choice
            return n;
        }

        // //kaam
        // //choice single
        // int nm1 = makePair(n-1);

        // // pair
        // int nm2 = makePair(n-2);
        // int pairWays = (n-1) * nm2;

        // // total ways
        // int totalWays = nm1 +pairWays;
        
        return makePair(n-1) + (n-1) * makePair(n - 2);
         
    }
    public static void main(String args[]){
        System.out.println("the no pairs are:"+makePair(5));

    }
    
}


