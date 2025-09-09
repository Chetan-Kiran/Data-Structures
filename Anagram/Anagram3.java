package Anagram;

//Time Complexity: O(n)
//Space Complexity: O(n)

import java.util.HashMap;

public class Anagram3 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : str2.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                System.out.println("Not Anagrams");
                return;
            }
            map.put(c, map.get(c) - 1);
        }
        System.out.println("Anagrams");
    }
}