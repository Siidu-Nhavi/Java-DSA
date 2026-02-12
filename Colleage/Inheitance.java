public class Inheitance{
    public static void main(String args[]){
        Parent p1 = new Parent();
        p1.demo();
        p1.display();
        p1.play();
        p1.study();
    

    }
}


interface Super{
    void demo();
    void display();
}

interface Player{
    void play();
    void study();
}

class Parent implements Super,Player{
    static int count=0;
    public void demo(){
       
        count++;
        System.out.println("demo called");
        System.out.println("count is :"+count);
    }

    public void display(){
        System.out.println("Everything is Good");
    }

    public void play(){
        System.out.println("Yes play");
    }

    public void study(){
        System.out.println("King is studyig dont distrub ");
    }
}