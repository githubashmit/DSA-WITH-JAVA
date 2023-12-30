package src.LinkedList;

import java.util.Scanner;

public class LL06_deleteFirstElement {
    LL01_Node  head;
    public void add(int data){
        if(head == null){
            head = new LL01_Node(data);
            return;
        }
        LL01_Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = new LL01_Node(data);
    }
    public LL01_Node deleteFirstElement(LL01_Node head){
        if(head == null || head.next == null){
            return null;
        }
        return head.next;
    }
    public void print(LL01_Node head){
        LL01_Node temp  = head;
        while(temp!= null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args){
        LL06_deleteFirstElement obj = new LL06_deleteFirstElement();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how much element you want in linkedList");
        int a= sc.nextInt();
        while(a>0){
            int b= sc.nextInt();
            obj.add(b);
            a--;

        }
        System.out.println("Linked List before deletion");
        obj.print(obj.head);
        System.out.println("Linked list after deletion");
        obj.head = obj.deleteFirstElement(obj.head);
        System.out.println("print");
        obj.print(obj.head);
    }
}
