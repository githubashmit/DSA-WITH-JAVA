package src.LinkedList;

public class LL05_deleteMiddleElement {
    public LL01_Node deleteMiddleElement(LL01_Node head){

        if(head ==null || head.next == null){//base case 1
            return null;     //if there is no node and there is one node
        }
        if(head .next.next == null){// base case 2
            head.next = null;      // if there is two node
            return head;
        }

        // initializing three variable with head, head.next and head.next.next bcz we are confirm that at this line there will be no null pointer exception
        LL01_Node prev = head;     // firstly initialize head, slow , fast
        LL01_Node slow= head.next;
        LL01_Node fast = head.next.next;

        while(fast !=null && fast.next != null){   //loop
            fast = fast.next.next;
            slow = slow.next;
            prev = prev.next;
        }
        prev.next = slow.next;        // to delete slow
        return head;                  // return head
    }
}
