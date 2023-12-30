package src.LinkedList;

public class LL02_LinkedList {
    LL01_Node head;
    public void add(int data){
        if(head == null){
            head= new LL01_Node(data);
        }
        else{
            LL01_Node curr= head;
            while(curr.next !=null){
                curr= curr.next;
            }
            curr.next= new LL01_Node(data);
        }
    }

    public void print(){
        LL01_Node curr= head;
        while(curr !=null){
            System.out.println(curr.value);
            curr=curr.next;
        }
    }

//    public void deleteLastNode(){
//        LL01_Node p=head;
//        LL01_Node q = head.next;
//        while(q.next!=null){
//            p=p.next;
//            q=q.next;
//        }
//        p.next = null;
//    }

    public void deleteLastNode(){
        if (head == null){ // there is no node
            return;
        }

        if(head.next == null){ // there is only one node
            head = null;
            return;
        }

        // there is n number of nodes
        LL01_Node curr = head;
        while (curr.next.next != null){
            curr = curr.next;
        }

        curr.next = null;
    }


    public static void main(String[] args){
        LL02_LinkedList obj=new LL02_LinkedList();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);
        obj.add(6);
        obj.print();
        obj.deleteLastNode();
        obj.deleteLastNode();
        obj.deleteLastNode();
        obj.deleteLastNode();
        obj.deleteLastNode();
        obj.deleteLastNode();
        obj.deleteLastNode();
        obj.deleteLastNode();
        obj.deleteLastNode();
        obj.deleteLastNode();
        obj.deleteLastNode();
        obj.deleteLastNode();
        obj.deleteLastNode();
        obj.deleteLastNode();
        obj.print();



    }
}

