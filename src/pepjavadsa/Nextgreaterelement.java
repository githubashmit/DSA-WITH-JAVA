package src.pepjavadsa;
import java.util.*;
public class Nextgreaterelement {
    public static void main(String[] args){
        int arr[]={1,3,4,2};
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
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
        Collections.reverse(ans);
        System.out.println(ans);
    }
}
