package Two_pointers;

import java.util.HashSet;
import java.util.Scanner;

public class TwoSumUsingHashSet {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int target = sc.nextInt();
    if(existPair(a, target)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
    sc.close();
  }

  static boolean existPair(int[] a, int target) {
    HashSet<Integer> hs = new HashSet<>();
    for(int num : a) {
      int elem = target - num;
      if(hs.contains(elem)) return true;
      hs.add(num);
    }

    return false;
  }
}
