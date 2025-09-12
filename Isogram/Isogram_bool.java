package Isogram;

import java.util.Scanner;

public class Isogram_bool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean[] arr = new boolean[26];

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(arr[ch - 'a']){
                System.out.println("Not an Isogram");
                return;
            }else{
                arr[ch - 'a'] = true;
            }
        }

        for(int i=0; i<arr.length; i++){
            if(!arr[i]){
                System.out.println("Not an Isogram");
            }
        }
        System.out.println("Isogram");
        sc.close();
    }
}
