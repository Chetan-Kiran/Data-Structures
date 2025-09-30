package Two_pointers;

import java.util.*;

public class TwoSumUsingSortingAndTwoPointer {
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
    int i = 0, j = a.length - 1;
    while(i < j) {
      int sum = a[i] + a[j];
      if(sum == target) return true;
      else if(sum < target) i++;
      else j--;
    }

    return false;
  }
}
