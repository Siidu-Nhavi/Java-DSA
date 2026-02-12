public class TestGym {
    public static void main(String args[]){
        System.out.print("the annual fees of first Member is");
        GymMembership g1 = new GymMembership("Siddu");
        GymMembership g2 = new GymMembership("rahul");
        g1.setMonthlyFee(700);
        g1.calculateAnnualFee();
        g1.display();
        System.out.println("the annual fees of second Member is");
        g2.setMonthlyFee(2100);
        g2.calculateAnnualFee();
        g2.display();

    }
    
}

class GymMembership{
    private static int  monthlyFee;
    public String memberName;

    //constructor 
    GymMembership(String name){
        this.memberName = name;
    }

    public void setMonthlyFee(int n){
        monthlyFee=n;
    }
    public int calculateAnnualFee(){
        return monthlyFee*=12;
    }

    public void display(){
        System.out.println("the name of Gym member is:"+memberName);
        System.out.println("the annual fee of gym membership is:"+monthlyFee);
    }

}
