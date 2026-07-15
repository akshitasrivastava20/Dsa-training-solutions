package solutions.Oops.Inheritance;

public class Box {
    int l;
    int h;
    int b;
    Box(){
        l=-1;
        h=-1;
        b=-1;

    }
    Box(int l,int h,int b){
        this.l=l;
        this.h=h;
        this.b=b;
    }
    Box(Box old){
        this.l=old.l;
        this.h=old.h;
        this.b=old.b;
    }

    
}
