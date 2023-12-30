package src.LinkedListLearn;

import java.util.Scanner;

public class LLL02_LinkedList {
    LLL01_Node head;
    public void add(int val){
        if(head == null){
            head = new LLL01_Node(val);
            return;
        }

        LLL01_Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = new LLL01_Node(val);
    }

    public void print(){
        print(this.head);
    }
    private void print(LLL01_Node head){
        if(head == null){// base case
            return;
        }
        System.out.println(head.val);
        print(head.next);
    }

    public static void main(String[] args) {
        LLL02_LinkedList linkedList = new LLL02_LinkedList();

        // simple way
//        linkedList.add(1);
//        linkedList.add(2);
//        linkedList.add(3);
//        linkedList.add(4);
//        linkedList.add(5);
//        linkedList.add(6);
//        linkedList.add(7);
//
//        linkedList.print();

        // dynamic way
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements you want in the linked list -->");
        int a = sc.nextInt();
        System.out.println();

        System.out.println("Enter Integer you want ->");

        while (a>0){
            linkedList.add(sc.nextInt());
            a--;
        }

        linkedList.print();
    }
}
