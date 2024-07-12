package src.binarySearchTree;

public class BST02_search {
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
    public Node insert(Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data> val){
            root.left = insert(root.left , val);
        }
        else{
            root.right = insert(root.right , val);
        }
        return root;
    }
    public void inorder(Node root ){
        if(root == null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+"->");
        inorder(root.right);
    }
    public boolean search(Node root , int value){
        if(root == null){
            return false;
        }
        if(root.data>value){
            return search(root.left, value);
        }
        else if(root.data == value){
            return true;
        }else{
            return search(root.right , value);
        }
    }

    public static void main(String[] args) {
        BST02_search st = new BST02_search();
        int n[] = {6,4,9,1,2,3,4,5,6,0,7};
        Node root = null;
        for(int i =0;i<n.length;i++){
            root = st.insert(root , n[i]);
        }
        st.inorder(root);
        System.out.println();
        System.out.println(st.search(root, 6));
    }
}
