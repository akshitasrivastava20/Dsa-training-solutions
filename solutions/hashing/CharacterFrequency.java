package solutions.hashing;

import java.util.HashMap;

public class CharacterFrequency {
    public static void main(String[] args) {
        String s = "aaabcb";
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0) + 1);
        }
        System.out.println(mp);
    }
}
