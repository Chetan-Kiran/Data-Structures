package Two_pointers;

import java.util.*;
public class TwoSumUsingSortingAndBinarySearch {
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
    Arrays.sort(a);
    int n = a.length;
    for(int i = 0; i < n; i++) {
      int pos = binarySearch(a, n, target - a[i]);
      if(pos != -1 && pos != i) return true;
    }

    return false;
  }

  static int binarySearch(int[] a, int n, int x) {
    int l = 0, r = n - 1;
    while(l <= r) {
      int m = (l + r) / 2;
      if(x == a[m]) return m;
      else if(x < a[m]) r = m - 1;
      else l = m + 1;
    }

    return -1;
  }
}
