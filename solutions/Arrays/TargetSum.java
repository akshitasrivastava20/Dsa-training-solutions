public class TargetSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int target=8;
        targetsum(arr, target);

    }
    static void targetsum(int[] arr,int target){
        int s=0;
        int e=arr.length-1;
        while(s<e){
            if(arr[s]+arr[e]==target){
                System.out.println(arr[s]+" "+arr[e]);
            }
            s++;e--;
        }
        
    }
}


