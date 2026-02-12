
// implementation of stack using arraylist

import java.util.ArrayList;
public class StackB {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        // push op
        public static void push(int data){
            list.add(data); //element is top of stack
        }

        //pop op
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek op
        public static int peek(){
            if(isEmpty()){ // stack accepts only +ve integers
                return -1; 
            }
            return list.get(list.size()-1);
        }
    }
    public static void main (String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
    
}
