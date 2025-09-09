package Anagram;

//Time Complexity: O(n)
//Space Complexity: O(1)

public class Anagram4 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        int[] count = new int[26];

        for (char c : str1.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : str2.toCharArray()) {
            count[c - 'a']--;
        }
        for (int i : count) {
            if (i != 0) {
                System.out.println("Not Anagrams");
                return;
            }
        }
        System.out.println("Anagrams");
    }
}
