package src.LinkedList;

import java.util.Scanner;

public class LL07_LastNode {
    LL01_Node head;
    public void add(int data){
        if(head == null){
            head = new LL01_Node(data);
            return ;
        }
        LL01_Node curr = head;
        while(curr.next != null){
            curr=curr.next;
        }
        curr.next = new LL01_Node(data);
    }
    public LL01_Node deleteLastElement(LL01_Node head){
        if(head == null || head.next == null){
            return null;
        }
        LL01_Node p=head;
        LL01_Node q=head.next;
        while(q.next!=null){
            q=q.next;
            p=p.next;
        }
        p.next = null;
        return head;
    }
    public void print(LL01_Node head){
        LL01_Node temp = head;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
    public static void main(String[] args){
        LL07_LastNode obj = new LL07_LastNode();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter how much you want");
        int a =sc.nextInt();
        while(a>0){
            int b =sc.nextInt();
            obj.add(b);
            a=a-1;
        }
        obj.print(obj.head);
        obj.head = obj.deleteLastElement(obj.head);
        obj.print(obj.head);
    }
}
