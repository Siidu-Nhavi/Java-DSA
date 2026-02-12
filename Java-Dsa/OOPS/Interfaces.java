public class Interfaces {
    public static void main(String args[]){
        King k = new King();
        k.moves();
        Queen q = new Queen();
        q.moves();
        System.out.println("the number of objects created for King is :"+King.objCount);
        System.out.println("the number of objects created for Queen is :"+Queen.objCount);
        
    }
    
}

//base class
 interface ChessPlayer{
    void moves();
   public static int objCount = 0;
}

//derived class
class Queen implements ChessPlayer{
    static int objCount = 0;

    Queen() {
        objCount++; // increment when object is created
    }

    public void moves(){
        System.out.println("up,down,left,right,diagonal(in all four directions)");

    }
}


//derived class
class King implements ChessPlayer {
    static int objCount = 0;

    King() {
        objCount++; // increment when object is created
    }

    public void moves(){
        System.out.println("up,down,left,right(moves in one direction)");
    }
   
}
