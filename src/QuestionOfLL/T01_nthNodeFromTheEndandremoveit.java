package src.QuestionOfLL;

public class T01_nthNodeFromTheEndandremoveit {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }

        // Calculate the size of the linked list
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        // If n is equal to the size, remove the head node
        if (n == size) {
            return head.next;
        }

        // Find the previous node of the nth node from the end
        int ptf = size - n; // position to find
        ListNode prev = head; // previous node
        int cp = 1; // current position

        while (cp != ptf) {
            prev = prev.next;
            cp++;
        }

        // Remove the nth node from the end
        prev.next = prev.next.next;

        return head;
    }

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        // Example usage:
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        T01_nthNodeFromTheEndandremoveit solution = new T01_nthNodeFromTheEndandremoveit();
        head = solution.removeNthFromEnd(head, 2);

        // Print the resulting linked list
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
