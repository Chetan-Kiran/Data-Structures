package Two_pointers;

import java.util.*;

public class reverseOfTheString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String reversed = reverse(s);
    System.out.println(reversed);
    sc.close();
  }

  static String reverse(String s) {
    int l = 0, r = s.length() - 1;
    char[] ch = s.toCharArray();
    while(l < r) {
      char temp = ch[l];
      ch[l] = ch[r];
      ch[r] = temp;
      l++;
      r--;
    }
    return String.valueOf(ch);
  }
}
