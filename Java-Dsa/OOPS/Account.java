public class Account {
    
    public static void main(String args[]){
        SavingAccount s1 = new SavingAccount(2000,2010);
        SavingAccount s2 = new SavingAccount(3000,9012);
        System.out.println("---------1st response ------------");
        SavingAccount.setInterest(0.04);
        

        s1.calculateMonthlyInterest();
        s2.calculateMonthlyInterest();
        System.out.println("after applying 4% interest");
        s1.displayBalance();
        s2.displayBalance();
        System.out.println("---------2nd response ------------");
        SavingAccount.setInterest(0.05);
        s1.calculateMonthlyInterest();
        s2.calculateMonthlyInterest();
        System.out.println("after applying 5% interest");
        s1.displayBalance();
        s2.displayBalance();

    }
    
}

class SavingAccount{
    int accountNumber;
    private static double annualInterest;
    private double balance;

    //constructor
    SavingAccount(int n,int acNo){
        this.balance = n;
        this.accountNumber=acNo;
    }
    //get method to set private var
    public static void setInterest(double newInterest){
        annualInterest = newInterest;
    }
    
     //calculate monthly interest
    public void calculateMonthlyInterest(){
        double interest = (balance*annualInterest)/12;
        balance+= interest;
    }

    //display the balance
      public void displayBalance() {
        System.out.println("Your account number is:"+accountNumber);
        System.out.println("Current Balance: "+ balance);
        
    }
}

