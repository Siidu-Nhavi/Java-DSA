public class EmployeSet {

    class Employee {
        // Non-static variables (object specific)
        String fname;
        String lname;
        double salary;

        // Static variable (shared by all Employee objects)
        static int count = 0;

        Employee(String fname, String lname, double salary) {
            this.fname = fname;
            this.lname = lname;
            this.salary = salary;
            count++; // increment every time a new employee is created
        }

        void setFirstname(String fname) {
            this.fname = fname;
        }

        String getFirstname() {
            return fname;
        }

        static void displayCount() {
            System.out.println("Total Employees: " + count);
        }
    }

    public static void main(String[] args) {
        EmployeSet outer = new EmployeSet();

        Employee emp1 = outer.new Employee("Siddu", "Patil", 50000);
        Employee emp2 = outer.new Employee("Ankit", "Sharma", 60000);

        // Access non-static method
        System.out.println("Emp1 First Name: " + emp1.getFirstname());
        System.out.println("Emp2 First Name: " + emp2.getFirstname());

        // Access static variable and method
        System.out.println("Employee Count (via class): " + Employee.count);
        Employee.displayCount();
    }
}
