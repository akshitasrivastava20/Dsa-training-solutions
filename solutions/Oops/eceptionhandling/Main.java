package solutions.Oops.eceptionhandling;

public class Main {
    public static void main(String[] args) {
        int a=9;
        int b=0;
        divide(a,b);


       
    }
    static int divide(int a ,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Divide by zero is not allowed");
        }
        return a/b;
    }

}
