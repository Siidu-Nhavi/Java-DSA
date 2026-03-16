import java.util.PriorityQueue;
public class Creation {
    static class Student implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student  s2){
            return this.rank - s2.rank;
        }

    }
    public static void main(String[] args) {
        //create object class and use it
        PriorityQueue<Student> pq = new PriorityQueue<>();
        // pq.add(10); // O(logn)
        // pq.add(3);
        // pq.add(2);
        // pq.add(0);
        // pq.add(1);

        pq.add(new Student("rahul",0));
        pq.add(new Student("digambar",10));
        pq.add(new Student("tej",9));
        pq.add(new Student("jitesh",6));
        pq.add(new Student("ritesh",1));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + "->"+ pq.peek().rank); // O(1);
            pq.remove(); // O(logn)
        }
    }
}