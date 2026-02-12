public class Pro1 {
    static class Encapsulation {

        private int rollNo;
        private String name;
        private int marks;
        private double percentage;

        // constructor
        public Encapsulation(int rollNo, String name, int marks, double percentage) {
            this.rollNo = rollNo;
            this.name = name;
            this.marks = marks;
            this.percentage = percentage;
        }

        // setters
        public void setRollNo(int rollNo) {
            this.rollNo = rollNo;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setMarks(int marks){
            this.marks = marks;
        }

        public void setPercentage(double percentage){
            this.percentage = percentage;
        }

        // getters
        public int getRollNo() {
            return rollNo;
        }

        public String getName() {
            return name;
        }

        public int getMarks(){
            return marks;
        }

        public double getPercentage(){
            return percentage;
        }

        // methode to display all details:
        void display() {
            System.out.println("Your name Is:" + name);
            System.out.println("Roll no is:" + rollNo);
            System.out.println("marks:" + marks);
            System.out.println("percentage:" + percentage);
        }

    }

    public static void main(String args[]) {
        Encapsulation e1 = new Encapsulation(101, "Siddu", 90, 90.00);
        e1.display();

        System.out.println("----------After the Setter And Getter-----------");
        e1.setName("King");
        e1.setMarks(100);
        e1.setPercentage(67.009);
        e1.setRollNo(102);

        e1.getMarks();
        e1.display();

    }
}

