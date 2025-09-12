package Isogram;

import java.util.HashSet;

public class Isogram_hashset {
    public static void main(String[] args) {
        HashSet<Character> set = new HashSet<>();
        String str = "Chetan";

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            set.add(ch);
        }

        if(set.size() == str.length()){
            System.out.println("Isogram");
        } else {
            System.out.println("Not an Isogram");
        }
    }
}
