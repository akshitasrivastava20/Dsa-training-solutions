public class CustomLinkedList {
    private Node head;
    private Node tail;
    private int size;
    public CustomLinkedList(){
        this.size=0;
    }

    private class Node{
        private int value;
        private Node next;


        public Node(int value){
            this.value=value;
            
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }


    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"-->");
            temp=temp.next;

        }
        System.out.println("END");
    }

    public void insertFirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size++;
    }

    public void insertLast(int value){
        if(tail==null) {insertFirst(value);return;}
        Node node=new Node(value);
        tail.next=node;
        tail=node;
        size++;
        
    }

    public void insert(int val,int index){
        
        if(index==0) {insertFirst(val);return;}
        if(index==size){insertLast(val);return;}
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;


        }
        Node node=new Node(val,temp.next);
        
        temp.next=node;
        size++;

    }

    public int deleteFirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        return val;

    }

    public Node find(int val){
        Node temp=head;
        while(temp!=null){
            if(temp.value==val) return temp;
            temp=temp.next;
        }
        return null;
    }
    public Node get(int index){
        Node node=head;
        for (int i = 0; i < index; i++) {
              node=node.next;

            
        }
        return node;
    }
    public int deleteLast(CustomLinkedList ll){
        if(ll.size==1) return deleteFirst();
        int val=ll.get(size).value;
        Node newlast=ll.get(size-1);

        newlast.next=null;
        tail=newlast;
        return val;
        
    }
    public int deleteposition(CustomLinkedList ll,int index){
        if(index==0) return deleteFirst();
        if(index==size-1) return deleteLast(ll);
        int val=ll.get(index).value;
        Node bef_index=ll.get(index-1);
        bef_index.next=ll.get(index).next;
        return val;
    }

    private Node insertRec(int value,int index,Node node){
        if(index==0){
            Node newnNode=new Node(value, node);
            return newnNode;
        }
        node.next=insertRec(value, index--, node.next);
        return node;
    }

    public static void main(String[] args) {
        CustomLinkedList ll=new CustomLinkedList();
        ll.insertFirst(15);
        ll.insertFirst(20);
        ll.insertFirst(45);
        ll.insertFirst(67);
        ll.insert(100, 2);
        ll.deleteFirst();

        ll.display();
    }
}
