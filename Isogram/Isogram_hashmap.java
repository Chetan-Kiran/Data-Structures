package Isogram;

import java.util.HashMap;

public class Isogram_hashmap {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        String str = "Chetan";

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        if(map.size() == str.length()){
            System.out.println("Isogram");
        } else {
            System.out.println("Not an Isogram");
        }
    }
}
