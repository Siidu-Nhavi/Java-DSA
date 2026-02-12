import java.util.*;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();

        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i); // find character at i 
            //push opening parentheses
            if(ch == '(' || ch == '[' || ch == '{'){
                stk.push(ch);
            }else{
                //closing parentheses
                if(stk.isEmpty()){
                    return false;
                }
                if((stk.peek() == '(' && ch == ')' ) 
                || (stk.peek() == '[' && ch == ']') 
                || (stk.peek() == '{' && ch =='}') ){ // pair
                   
                    stk.pop();
                }else{
                    return false;
                }
            }
   
        }
        if(stk.isEmpty()){
            return true;
        }else{
            return false;
        }
        
    }

    public static void main(String args[]) {
        String str = "({{[()]}})";// true
        System.out.println(isValid(str));
    }

}
