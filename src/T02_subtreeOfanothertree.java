package src;
import java.util.*;
public class T02_subtreeOfanothertree {
    int idx;
    T02_subtreeOfanothertree(){
        idx = -1;
    }
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left= null;
            this.right = null;
        }
    }

    public Node buildTree(int[] node){
        idx++;
        if(node[idx]==-1){
            return null;
        }
        Node newNode = new Node(node[idx]);
        newNode.left = buildTree(node);
        newNode.right = buildTree(node);
        return newNode;
    }
    public boolean isIdentical(Node root , Node subroot){
        if(root == null && subroot == null){
            return true;
        }
        if(root == null || subroot == null){
            return false;
        }
        if(root.data == subroot.data){
            return isIdentical(root.left , subroot.left) && isIdentical(root.right , subroot.right);
        }
        return false;
    }
    public boolean isSubtree(Node root , Node subroot){
        if(subroot == null ){
            return true;
        }
        if(root==null){
            return false;
        }
        if(subroot.data ==root.data ) {
            if(isIdentical(root, subroot)){
                return true;
            }
        }
        return isSubtree(root.left , subroot) || isSubtree(root.right , subroot);
    }
    public void preorder(Node node){
        if(node == null){
//            System.out.println(-1+" ");
            return;
        }
        System.out.println(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
        int [] node = {3,4,1,-1,-1,2,0,-1, -1, -1 ,5,-1,-1};

//        if(a==0){
//            return;
//        }
//        for(int i =0;i<a;i++){
//            node[i]=sc.nextInt();
//        }
//        int b = sc.nextInt();
        int [] node1 ={4,1,-1,-1,2,-1,-1};
//        for(int i =0;i<b;i++){
//            node1[i]=sc.nextInt();
//        }
        T02_subtreeOfanothertree obj1 = new T02_subtreeOfanothertree();
        T02_subtreeOfanothertree obj2 = new T02_subtreeOfanothertree();
//        obj.idx=-1;
        Node root1 = obj1.buildTree(node);
////        obj.idx=-1;
        Node root2 = obj2.buildTree(node1);
        System.out.println(obj1.isSubtree(root1, root2));
//        obj1.preorder(root1);
//        obj2.preorder(root2);


    }
}
