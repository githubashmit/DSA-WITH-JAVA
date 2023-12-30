package src.LinkedList;


import java.util.Scanner;

public class LL03_UserFriendlyLinkedList {
    LL01_Node head;
    Scanner sc= new Scanner(System.in);
    private void add(int data){
        if(head ==null){
            head = new LL01_Node(data);
        }
        else{
            LL01_Node curr = head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next= new LL01_Node(data);
        }
    }
    private int deleteLastNode() {
        if (head == null) {
            return -1;
        }
        if (head.next == null) {
            int a = head.value;
            head = null;
            return a;
        }
        LL01_Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }

        int a = curr.next.value;
        curr.next = null;
        return a;
    }
    private void print(){
        LL01_Node curr = head;
        System.out.print("[");
        while(curr!=null){

            System.out.print(curr.value+" ");
            curr=curr.next;
        }
        System.out.print("]");
    }

    private void description(){
        // Description Area
        int i = 26;
        while (i>=0){
            System.out.print('-');
            i--;
        }
        System.out.println();
        System.out.print('|');
        System.out.println(" Linked List Description |");
        i = 26;
        while (i>=0){
            System.out.print('-');
            i--;
        }
        System.out.println();
        System.out.println("1.add    2. deleteLastNode     3. print    4. exit");
        System.out.println();
    }

    public void operation(int a){
        switch (a){
            case 1: {
                System.out.println("-> Enter An Element To Add");
                System.out.print("-> ");
                add(sc.nextInt());
                return;
            }

            case 2:{
                int temp = deleteLastNode();
                if(temp == -1){
                    System.out.println("-> Error!!-No Element To Delete");
                }else {
                    System.out.println("-> You Deleted -> " + temp);
                }
                return;
            }

            case 3:{
                if(head == null){
                    System.out.println("-> No Element In List To Print!");
                }else {
                    print();
                }
                return;
            }

            default:{
                System.out.println("-> Error!!-Enter valid operation");
            }
        }
    }

    public void userFriendlyFunction(){
        description();

        while(true){
            System.out.println();
            System.out.println("-> Enter Operation to Perform");
            System.out.print("-> ");
            int x = sc.nextInt();

            if(x == 4){
                System.out.println("-> Thanks To use Me");
                return;
            }
            operation(x);
        }
    }

    public static void main(String[] args) {
        LL03_UserFriendlyLinkedList list = new LL03_UserFriendlyLinkedList();
        list.userFriendlyFunction();
    }
}
