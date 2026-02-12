class A extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
        try{
            Thread.sleep(-100);
        }catch(Exception e){
            e.getMessage();
        }
    }
}

public class P {

    public static void main(String[] args) {
        A a1 = new A();
        a1.start();
    }
}