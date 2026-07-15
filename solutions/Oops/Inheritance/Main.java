package solutions.Oops.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(1, 2, 3);
        BoxWeight b3 = new BoxWeight(2,3,4,5);
        System.out.println(b1.l + " " + b1.h + " " + b1.b);
        System.out.println(b2.l + " " + b2.h + " " + b2.b);
        System.out.println(b3.l + " " + b3.h + " " + b3.b);
        System.out.println(b3.weight);
    }
}