import java.util.Scanner;
public class ElectricityBillTest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ElectricityBill b1 = new ElectricityBill("9021902100", "siddu");
        b1.display();
        System.out.print("enter units:");
        int unit = sc.nextInt();
        sc.close();
        System.out.print("Your Electricity Bill is:"+b1.calculateBillAmount(unit));

    }
    
}

class ElectricityBill{
    String consumer_Mob;
    String consumer_Name;
    
    // constructor

    ElectricityBill(String mb, String cn){
        this.consumer_Mob = mb;
        this.consumer_Name = cn;
    }

   

    public int  calculateBillAmount(int unitConsumed ){
        int billAmount =0;
        if(unitConsumed <=100){
            billAmount = 3*unitConsumed;
        }else if(unitConsumed > 100 && unitConsumed <= 300){
            billAmount = 5*unitConsumed;
        }else{
            billAmount = 8*unitConsumed;
        }
        return billAmount;
    }

    public void display(){
        System.out.println("Your mobile number is:"+consumer_Mob);
        System.out.println("Consumer name is:"+consumer_Name);
        
    }

}