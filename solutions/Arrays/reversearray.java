import java.util.Arrays;

public class reversearray {
    public static void main(String[] args) {
        int[] arr={34,45,54,67};
        System.out.println(Arrays.toString(reversearr(arr)));
    }

    static int[] reversearr(int[] arr){
        int[] arr2=new int[arr.length];
        for (int i=0;i<arr.length;i++) {
            arr2[i]=arr[(arr.length-1)-i];
            
        }
        return arr2;
    }
}
