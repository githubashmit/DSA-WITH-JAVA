package src;

import java.util.ArrayDeque;
import java.util.Queue;

public class Node {
    int data;
    Node next, child;

    Node(int data, Node next, Node child) {
        this.data = data;
        this.next = next;
        this.child = child;
    }
}
class Main{
    public Node convertList(Node head){
        Node curr= head;
        Queue<Node> q = new ArrayDeque<>();
        while(curr != null){
            if(curr.next == null){
                curr.next = q.poll();
            }
            if(curr.child != null){
                q.add(curr.child);
            }
            curr= curr.next;
        }
        return head;
    }
    public void print(Node head){

    }

    public static void main(String[] args) {

    }
}
