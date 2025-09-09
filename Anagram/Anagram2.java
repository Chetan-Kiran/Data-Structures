package Anagram;

//Time Complexity: O(n)
//Space Complexity: O(n)

import java.util.HashMap;
import java.util.Map;
public class Anagram2 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        Map<Character, Integer> Map1 = new HashMap<>();
        Map<Character, Integer> Map2 = new HashMap<>();
        
        for(char c : str1.toCharArray()){
            Map1.put(c, Map1.getOrDefault(c, 0) + 1);
        }
        for(char c : str2.toCharArray()){
            Map2.put(c, Map2.getOrDefault(c, 0) + 1);
        }

        if(Map1.equals(Map2)){
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
