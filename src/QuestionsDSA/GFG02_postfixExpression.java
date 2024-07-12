package src.QuestionsDSA;
import java.util.*;
public class GFG02_postfixExpression {
    public static int evaluatePostFix(String s){
        Stack<Integer> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for(char i : arr){
            if(i>=48 && i<=57){
                stack.push(i-'0');
                continue;
            }
            stack.push(operation(i , stack.pop() , stack.pop()));
        }
        return stack.pop();
    }
    public static int operation(char op , int b, int a){
        return switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> -1;
        };
        /*
        switch(op){ //same as above switch
            case '+': return a + b;
            case '-': return a-b;
            case '*': return a*b;
            case '/': return a/b;

            default : return -1;
        }
         */
    }

    public static void main(String[] args) {
//        GFG02_postfixExpression s = new GFG02_postfixExpression();
        int i= evaluatePostFix("231*+9-");
        System.out.println(i);
    }
}
