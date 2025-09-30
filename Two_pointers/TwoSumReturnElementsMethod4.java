package Two_pointers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class TwoSumReturnElementsMethod4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int target = sc.nextInt();
    int[] res = existPair(a, target);
    System.out.println(Arrays.toString(res));
    sc.close();
  }

  static int[] existPair(int[] a, int target) {
    HashSet<Integer> hs = new HashSet<>();
    for(int num : a) {
      int elem = target - num;
      if(hs.contains(elem)) return new int[]{num, elem};
      hs.add(num);
    }

    return new int[]{-1, -1};
  }
}
