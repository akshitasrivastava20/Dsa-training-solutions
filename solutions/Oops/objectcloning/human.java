package solutions.Oops.objectcloning;

public class human implements Cloneable {
    String name;
    int age;

    human(String name,int age){
        this.name=name;
        this.age=age;
    }

    public Object clone () throws CloneNotSupportedException{
        return super.clone();

    }
}
