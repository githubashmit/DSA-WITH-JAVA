package src.BinaryTree;
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
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BT01_binaryTree tree = new BT01_binaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
//        tree.preorder(root);
//        tree.inorder(root);
        tree.postorder(root);
    }
}
