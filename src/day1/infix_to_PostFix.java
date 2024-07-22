package day1;

import java.util.Stack;

public class infix_to_PostFix {
    public static void main(String[] args) {
        String a = "(p+q)*(m-n)";
        Stack<Character> stack = new Stack<>();
        StringBuilder res = new StringBuilder();
        for(Character ch: a.toCharArray()){
            if(Character.isLetter(ch)){
                res.append(ch);
            }
            else if(ch == '('){
                stack.push(ch);
            } else if (ch == ')') {
                    while (!stack.isEmpty() && stack.peek() != '('){
                        res.append(stack.pop());
                    }
                    stack.pop()
            }else{
                switch (ch){
                    case '+':
                    case '-':
                        while (stack.peek() == '+' || stack.peek() == '-' || ){
                            res.append(stack.pop());
                        }
                    case '%':

                }
            }
        }
    }
}
