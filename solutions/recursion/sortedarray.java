package solutions.recursion;

public class sortedarray {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};
        boolean t=sorted(arr,0);
        System.out.println(t);
    }

    private static boolean sorted(int[] arr,int i){

        if(i==arr.length-1) return true;

        return arr[i]<arr[i+1]&&sorted(arr,i+1);
    }
}
