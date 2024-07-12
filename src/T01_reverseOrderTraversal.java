package src;
import java.sql.SQLOutput;
import java.util.*;

public class T01_reverseOrderTraversal {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left= null;
            this.right = null;
        }
    }
    int idx = -1;
    public Node buildTree(int[] nodes){
        idx++;
        if(nodes[idx]==-1){
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }
    public ArrayList<Integer> reverseLevelOrder(Node node){
        ArrayList<Integer> list  = new ArrayList<>();
        Queue<Node> q= new LinkedList<>();

        if(node==null){
            return list;
        }
        q.add(node);
        q.add(null);
        while(!q.isEmpty() && q.peek()!= null){
            while(q.peek() != null){
                Node curr= q.poll();
                list.add(0,curr.data);
                if(curr.right != null){
                    q.offer(curr.right);
                }
                if(curr.left!= null){
                    q.offer(curr.left);
                }
            }
            q.poll();
            q.offer(null);
        }
        return list;
    }
    public void preorder(Node node){
        if(node == null){
            System.out.println(-1+" ");
            return;
        }
        System.out.println(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a==0){
            return;
        }

        int [] nodes = new int[a];
        for(int i =0;i<a;i++){
            nodes[i] = sc.nextInt();
        }
        T01_reverseOrderTraversal obj = new T01_reverseOrderTraversal();
        Node root = obj.buildTree(nodes);
        System.out.println(root.data);
        l=obj.reverseLevelOrder(root);
        System.out.println(l);
        obj.preorder(root);
    }
}
