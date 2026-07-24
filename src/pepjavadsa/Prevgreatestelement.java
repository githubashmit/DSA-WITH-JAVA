package src.pepjavadsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Prevgreatestelement {
    public static void main(String[] args){
        int arr[]={1,3,4,2};
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && stack.peek()<arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans.add(-1);
            }else{
                ans.add(stack.peek());
            }
            stack.push(arr[i]);
        }
        System.out.println(ans);
    }
}
