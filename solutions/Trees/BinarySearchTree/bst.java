package Trees.BinarySearchTree;

public class bst {
    public bst(){

    }
    private class Node{
        int value;
        Node left;
        Node right;
        int height;
        public Node(int value){
            this.value=value;
        }
    }
    private Node root;
    public void insert(int val){
          root=insert(val, root);
          

    }

    public Node insert(int val,Node node){
        if(node==null){
            node=new Node(val);
            return node;
        }
        if(val<node.value){
            node.left=insert(val, node.left);
        }
        if(val>node.value){
            node.right=insert(val, node.right);
        }
        node.height=Math.max(height(node.left), height(node.right))+1;

        return node;
    }
    private int height(Node node){
        if(node==null) return -1;
        return node.height;
    }

    public void display(){
        display(root,"Root");
    }
    public void display(Node node,String msg){
        if(node==null) return;
        System.out.println(node.value+msg);
        display(node.left,"left child of"+node.value);
        display(node.right,"right child of"+node.value);
    }
    public void balanced(){
        balanced(root);
    }
    public boolean balanced(Node node){
        if(node==null)return true;
        return Math.abs(node.left.height-node.right.height)<=1&&balanced(node.left)&&balanced(node.right);
    }

    public void populate(int[] arr,int l,int h){
        if (l >= h) return;

        int mid=(l+h)/2;
        insert(arr[mid]);
        populate(arr,l , mid);
        populate(arr, mid, h);
    }

    public static void main(String[] args) {
        int[] arr={12,21,34,32,56,100,12,5,98};
        bst tree=new bst();
        tree.populate(arr,0,arr.length);
        tree.display();
    }

}
