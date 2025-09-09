package Anagram;

//Time Complexity: O(n log n)
//Space Complexity: O(1)

import java.util.Arrays;
public class Anagram1 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "lestin";
        
        str1.toLowerCase();
        str2.toLowerCase();

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        if(Arrays.equals(charArray1, charArray2)){
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
