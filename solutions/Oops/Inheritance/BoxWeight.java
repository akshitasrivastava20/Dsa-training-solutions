package solutions.Oops.Inheritance;

public class BoxWeight extends Box {
    int weight;
    BoxWeight(){
        super();
        weight=-1;
    }
    BoxWeight(int l,int h,int b,int weight){
        super(l,h,b);
        this.weight=weight;
    }
    BoxWeight(BoxWeight old){
        super(old);
        this.weight=old.weight;
    }

    
}
