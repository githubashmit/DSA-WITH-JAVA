package src.LinkedList;

public class LL08_Detection {

    public boolean cycleDetection(LL01_Node head){
        if (head == null || head.next == null){
            return false;
        }

        LL01_Node slow = head.next;
        LL01_Node fast = head.next.next;

        while(true){
            if(fast == null || fast.next == null){
                return false;
            }

            if(slow == fast){
                return true;
            }

            slow = slow.next;
            fast = fast.next.next;
        }
    }
}
