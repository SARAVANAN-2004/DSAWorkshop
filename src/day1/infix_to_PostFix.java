package day1;


import java.util.Stack;


public class infix_to_PostFix {
    public static int prec(char ch){
        switch (ch){
            case '+':
            case '-':
                return 1;
            case '/':
            case '*':
                return 2;

        }
        return 0;
    }
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
                    stack.pop();
            }else{
                while (!stack.empty() && prec(ch)  <= prec(stack.peek())){
                    res.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()){
            res.append(stack.pop());
        }
        System.out.println(res);
    }

}
