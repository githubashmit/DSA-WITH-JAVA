package src.BinaryTree;
import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right = null;
    }
}
public class BT01_binaryTree {
    int idx =-1;
    public Node buildTree(int[] nodes){
        idx++;
        if(nodes[idx] == -1){
            return null;
        }
        Node newNode= new Node(nodes[idx]);
        newNode.left=buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }
    public void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder((root.right));
    }

    public void inorder(Node root){
        if(root== null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public void postorder(Node root){
        if(root == null){
            return ;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }
    public void levelOrder(Node root){
        if(root == null){
            return ;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }
    public int countOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftNodes = countOfNodes(root.left);
        int rightNodes=countOfNodes(root.right);
        return leftNodes + rightNodes + 1;
    }
    public int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum+rightSum+root.data;
    }
    public int height(Node root){
        if(root == null){
            return 0;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        int myheight = Math.max(leftheight , rightheight) + 1;
        return myheight;
    }
    public int diameter (Node root){
        if(root == null){
            return 0;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = height(root.left) + height(root.right)+1;
        return Math.max(diam3 , Math.max(diam1 , diam2));
    }
    class TreeInfo{
        int ht;
        int diam;
        TreeInfo(int ht , int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }
    public TreeInfo diameter2(Node root){
        if(root == null){
           return  new TreeInfo(0,0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);
        int myHeight = Math.max(left.ht, right.ht) +1;
        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht +right.ht +1;
        int mydiam = Math.max(Math.max(diam1 , diam2),diam3);
        TreeInfo myInfo = new TreeInfo(myHeight , mydiam);
         return myInfo;
    }

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BT01_binaryTree tree = new BT01_binaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
//        tree.preorder(root);
//        tree.inorder(root);
//        tree.postorder(root);
//        tree.levelOrder(root);
        System.out.println(tree.countOfNodes(root));
        System.out.println(tree.sumOfNodes(root));
        System.out.println(tree.height(root));
        System.out.println(tree.diameter(root));
        System.out.println(tree.diameter2(root).diam);
    }
}
