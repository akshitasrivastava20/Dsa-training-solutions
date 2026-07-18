package solutions.Oops.objectcloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        human h1 = new human("Akshita", 20);
        human h2=(human)h1.clone();
        
       
    }
}
