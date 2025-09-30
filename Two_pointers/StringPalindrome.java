package Two_pointers;

import java.util.Scanner;
public class StringPalindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    sc.close();
    if(isPalindrome(s)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }

  static boolean isPalindrome(String s) {
    int i = 0, n = s.length() - 1;
    while(i < n) {
      if(s.charAt(i) != s.charAt(n)) {
        return false;
      }
      i++;
      n--;
    }

    return true;
  }
}
