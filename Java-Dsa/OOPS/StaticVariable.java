public class StaticVariable {
    
    public static void main(String args[]){
        Bank b1 = new Bank(122, "Siddu");
       b1.setrno(123);
       b1.get();
      


    }
}

 class Bank {
        static int rollNo;
        String name;

        public Bank(int rno, String n) {
            name = n;
            this.setrno(rno);
        }

        // For static variable 
        public static void setrno(int rno) {
           rollNo = rno;
        }

        public int get(){
            return rollNo;
        }

        void display() {
            System.out.println("Name is: " + name);
            System.out.println("Roll No is: " + rollNo);
        }
    }


