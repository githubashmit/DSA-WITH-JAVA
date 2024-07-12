package src;

import java.util.Stack;

public class Dummy {
    public static void main(String[] args) {
        char a = 97;


        System.out.println(a);
    }

    public static int evaluatePostFix(String s)
    {
        Stack<Integer> stack = new Stack<>();

        char[] arr = s.toCharArray(); // this is to convert string to charcater array

        for(char i: arr){
            if(i >= 48 && i <= 57){
                stack.push(i-'0');
                continue;
            }

            stack.push(operation(i, stack.pop(), stack.pop()));
        }

        return stack.pop();
    }

    public static int operation(char op, int b, int a){
        switch(op){
            case '+': return a + b;
            case '-': return a-b;
            case '*': return a*b;
            case '/': return a/b;

            default : return -1;
        }
    }
}
