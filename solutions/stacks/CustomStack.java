public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    int ptr=-1;
    public CustomStack(int size){
        this.data=new int[size];
    }
    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public boolean push(int val){
        if(isfull()) {
            System.out.println("stack is full");
            return false;
        }
        ptr++;
        data[ptr]=val;
        return true;
    }

    public int pop()
{   
    return data[ptr--];
}

    public int peek(){
        return data[ptr]; 
    }
    public boolean isfull(){
        if(ptr==data.length-1) return true;
        return false;
    }

    private boolean isempty(){
        if(ptr==-1) return true;
        return false;
    }


}
