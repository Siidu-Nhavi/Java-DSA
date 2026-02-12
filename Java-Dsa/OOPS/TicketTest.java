public class TicketTest {
    public static void main(String args[]){
        CinemaTicket c1 = new CinemaTicket("siddu", 900);
        c1.setTicketPrice(120);
        c1.display();

    }
    
}

class CinemaTicket{
    private static int ticketPrice;
    public String customerName;
    public int ticketBooked;

    CinemaTicket(String name,int b){
        this.customerName = name;
       this.ticketBooked = b;
    }
    public void setTicketPrice(int n){
        ticketPrice = n;
    }

    public int calculatePrice(){
        return ticketBooked*ticketPrice;
    }

    public void display(){
        System.out.println("The name of customer is:"+customerName);
        System.out.println("the price of ticket is:"+ticketPrice);
        System.out.println("total cost of ticket is:"+calculatePrice());
    }
}
