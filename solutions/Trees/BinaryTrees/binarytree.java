package Trees.BinaryTrees;

import java.util.Scanner;

public class binarytree {
    //binary class constructor
    public binarytree(){
    

    }
    //node class
    private static class Node{
        int value;
        Node left;
        Node right;
        //node constructor
        public Node(int value){
            this.value=value;
        }

    }
    //setting root variable for global
    private Node root;

    //for insertion of root
    public void populate(Scanner sc){
        System.out.println("enter the value for root");
        int val=sc.nextInt();
        root=new Node(val);
        populate(sc,root);
    }
    //for insertion to left and right of every node
    public void populate(Scanner sc,Node node){
        //left
        System.out.println("enter value to left of"+node.value+"?");
        boolean left=sc.nextBoolean();
        if(left){
            System.out.println("enter the value to be inserted to left");
            int val=sc.nextInt();
            node.left=new Node(val);
            populate(sc, node.left);
        }
        //right
        System.out.println("enter value to right of"+node.value+"?");
        boolean right=sc.nextBoolean();
        if(right){
            System.out.println("enter the value to be inserted to right");
            int val=sc.nextInt();
            node.right=new Node(val);
            populate(sc, node.right);
        }

    }
    //display root
    public void display(){
        
        display(root);
    }
    //display other nodes
    public void display(Node node){
        if(node==null) return;
        System.out.println(node.value);
        display(node.left);
        display(node.right);
    }

    //main function
    public static void main(String[] args) {
        binarytree tree=new binarytree();
        Scanner sc=new Scanner(System.in);
        tree.populate(sc);
        tree.display();
        

    }
}
