package src.QuestionsDSA;
import java.util.*;
public class LEET03_ImplementStackUsingTwoQueues {
    Queue<Integer> q1;
    Queue<Integer> q2;
    int n;
    LEET03_ImplementStackUsingTwoQueues(){
        q1= new LinkedList<>();
        q2 = new LinkedList<>();
        n=0;
    }
    public void push(int x){
        q1.add(x);
        n++;
        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }
        Queue<Integer> temp = q1;
        q1=q2;
        q2 = temp;
    }
    public int pop(){
        n--;
        return q2.remove();
    }
    public int top(){
        return q2.peek();
    }
    public boolean empty(){
        return n==0;
    }

}
