import java.util.HashMap;

public class frequencyCount {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,3,3,4,4,4,4,5,5};
        HashMap<Integer,Integer> mp=new HashMap<>();
       for (int i : arr) {
        mp.put(i,mp.getOrDefault(i,0)+1);

       }
       System.out.println(mp);


    }
   
}
