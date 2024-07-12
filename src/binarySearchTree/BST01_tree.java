package src.binarySearchTree;

import java.util.ArrayList;

public class BST01_tree {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data= data;
            this.left= null;
            this.right= null;
        }
    }
    public Node insert(Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            //left subtree
            root.left = insert(root.left , val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }
    public void inorder(Node root){
        if(root == null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public boolean search(Node root , int key){
        if(root == null){
            return false;
        }
        if(root.data> key){
            return search(root.left , key);
        }
        else if(root.data ==key){
            return true;
        }
        else{
            return search(root.right , key);
        }
    }
    public Node delete(Node root , int val){
        if(root.data > val){
            root.left = delete(root.left , val);
        }
        else if(root.data < val){
            root.right = delete(root.right , val);
        }
        else{//root.data == val
            //case 1
            if(root.left == null && root.right== null){
                return null;
            }
            //Case 2
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            //Case 3
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right , IS.data);
        }
        return root;
    }
    public Node inorderSuccessor(Node root){ // left most in right Subtree
        while(root.left != null ){
            root = root.left;
        }
        return root;
    }
    public void printInRange(Node root , int X , int Y){
        if(root == null){
            return ;
        }
        if(root.data >= X && root.data <=Y){
            printInRange(root.left , X , Y);
            System.out.print(root.data+" ");
            printInRange(root.right, X ,Y);
        }
        else if(root.data>= Y ){
            printInRange(root.left,X,Y);
        }else{
            printInRange(root.right , X, Y);
        }
    }
    public void printPath(ArrayList<Integer> path){
        for (int i=0;i < path.size() ; i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }
public void printRoot2Leaf(Node root , ArrayList<Integer>path){
        if(root == null){
            return ;
        }
        path.add(root.data);
        //leaf
        if(root.left == null && root.right == null){
            printPath(path);
        }else{
            printRoot2Leaf(root.left,path);
            printRoot2Leaf(root.right , path);
        }
        path.remove(path.size() -1);
}
    public static void main(String[] args) {
        BST01_tree st = new BST01_tree();
        int values[] = {8,5,3,6,10,11,14};
        Node root = null;
        for(int i =0 ;i< values.length; i++){
            root = st.insert(root , values[i]);
        }
        st.inorder(root);
        System.out.println();
//        System.out.println(st.search(root,100));
//        st.delete(root, 8);
//        st.inorder(root);
//        System.out.println();
//        st.printInRange(root, 3,12);
        st.printRoot2Leaf(root , new ArrayList<>());
    }
}
