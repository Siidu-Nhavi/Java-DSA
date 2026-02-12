public class BankAccount {
    public static void main(String args[]){
       Bank accounts[] = new Bank[2];
try{
       accounts[0] = new Bank("101","Rahul",5000,"pass123");
	   accounts[1] = new Bank("102","Aisha",7000,"abc999");

       accounts[0].initialBalace();
       accounts[1].initialBalace();
       accounts[0].withdraw(500, "pass123");
		


    }catch(Exception e){
    System.out.println("error:"+e);
}
}
    
}

class Bank extends Exception{
    String accNo;
    String accHolder;
    double balance;
    String password;

    Bank(String accNo,String accHolder,double balance,String password){
        this.accNo = accNo;
        this.accHolder = accHolder;
        this.balance = balance;
        this.password = password;
    }

    public void initialBalace(){
        System.out.println("Account Number is :"+accNo);
        System.out.println("Account holder name is:"+accHolder);
        System.out.println("Account balance is :"+balance);
        System.out.println("----------------");
    }

    public void withdraw(double amount,String password) throws LowBalanceException,NegativeNumberException,PasswordMismatchException{
        if(!this.password.equals(password)){
            throw new PasswordMismatchException("Invalid Password");
        }
        if(amount < 0){
            throw new NegativeNumberException("Enter valid number");
        }

        if(amount > balance){
            throw new LowBalanceException("Low balance in account");
        }

        balance -= amount;
        System.out.println("withdraw successfull! remaining balance is:"+balance);
    }

    public void deposit(double amount) throws NegativeNumberException,NegativeNumberException{
        if(amount < 0){
            throw new NegativeNumberException("Enter valid number");
        }
        if(amount == 0){
            return;
        }

        if(amount > 0){
            balance += amount;
        }
        System.out.println("deposited successfully");
    }
}


class LowBalanceException extends Exception{
    public  LowBalanceException(String msg){
        super(msg);
    }
}

class NegativeNumberException extends Exception{
    public NegativeNumberException(String msg){
        super(msg);
    }
}

class PasswordMismatchException extends Exception {
    public PasswordMismatchException(String msg){
        super(msg);
    }
}
