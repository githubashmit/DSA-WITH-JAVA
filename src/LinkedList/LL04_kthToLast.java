package src.LinkedList;

import java.util.Scanner;

public class LL04_kthToLast {
    LL01_Node head;
    public void add(int data){
        if(head == null){
            head = new LL01_Node(data);
        }
        else{
            LL01_Node curr = head;
            while(curr.next!= null){
                curr=curr.next;
            }
            curr.next= new LL01_Node(data);
        }
    }
    public void KthLinkedList(int k){

        LL01_Node curr = head;
        while(curr!=null){
            curr=curr.next;
            k--;
            if(k<=1 && curr!=null){
                System.out.println(curr.value);
            }
        }

    }
    public static void main(String[] args){
        LL04_kthToLast obj = new LL04_kthToLast();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);
        obj.add(6);
        obj.add(7);
        obj.add(8);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter kth number from where u want to print ");
        int a = sc.nextInt();
        obj.KthLinkedList(a);
    }
}
