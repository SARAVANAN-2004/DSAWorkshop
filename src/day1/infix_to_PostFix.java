package day1;

import java.util.Stack;

public class infix_to_PostFix {
    public static void main(String[] args) {
        String a = "(p+q)*(m-n)";
        Stack<Character> stack = new Stack<>();
        for(Character ch: a.toCharArray()){
            if(ch == '('){
                stack.push(ch);
            } else if (ch == ')') {

            }
        }
    }
}
