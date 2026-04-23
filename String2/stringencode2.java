package String2;

import java.util.Scanner;

public class stringencode2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().toLowerCase();
        StringBuilder r = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            c=(char)('a'+(c-'a'+i)%26);
            r.append(c);
        }
        System.out.println(r);
        sc.close();
    }
}
