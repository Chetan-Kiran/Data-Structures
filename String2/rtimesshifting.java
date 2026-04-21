package String2;

import java.util.Scanner;

public class rtimesshifting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.print("Enter shift value: ");
        int r = sc.nextInt();
        System.out.println("Encoded string: " + encode(s, r));
        sc.close();    //rtimesshifting
    }
public static String encode(String s, int r) {
        StringBuilder res = new StringBuilder();
	for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
		if (ch >= 'a' && ch <= 'z') {
                ch = (char) ('a' + (ch - 'a' + r) % 26);
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) ('A' + (ch - 'A' + r) % 26);
            }
	res.append(ch);
        }
	return res.toString();

    }
}
