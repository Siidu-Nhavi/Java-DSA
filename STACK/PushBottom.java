import java.util.*;

public class PushBottom {
    public static void pushBottom( Stack<Integer> s,int data){
        // base case
        if(s.isEmpty()){
            s.push(data); // when stack becomes empty then pusg target element at bottom
            return;
        }
        int top = s.pop();//remove top
        pushBottom(s,data);//call fun
        s.push(top);//push back all previous elements
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        int data = 4;
        pushBottom(s,data);
        System.out.println("the element is pushed at bottom of the stack:");
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    
}
