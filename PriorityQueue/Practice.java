import java.util.*;
public class Practice {
    static class Student implements Comparable<Student>{
        String name;
        int marks;
        public Student(String n, int marks){
            this.name = n;
            this.marks = marks;
        }
        @Override

        public int compareTo(Student p2){
            return this.marks - p2.marks;
        }
    }
    public static void main(String args[]){
        PriorityQueue<Student> pq = new PriorityQueue<>();
        
        pq.add(new Student("rahul",100));
        pq.add(new Student("dimari",78));
        pq.add(new Student("neha",34));
        pq.add(new Student("kamles",73));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name +"->"+pq.peek().marks);
            pq.remove();
        }

        
    }   
}
