package Isogram;

public class Isogram_frquArr {
    public static void main(String[] args) {
        String str = "Chetan";
        int[] frqu = new int[26];
        str.toLowerCase();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            frqu[ch - 'a']++;
        }

        for(int i=0; i<frqu.length; i++){
            if(frqu[i] > 1){
                System.out.println("Not an Isogram");
                return;
            }
        }
        System.out.println("Isogram");
    }
}
