package Two_pointers;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSumReturnElementsMethod2 {
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
    Arrays.sort(a);
    int i = 0, j = a.length - 1;
    while(i < j) {
      int sum = a[i] + a[j];
      if(sum == target) return new  int[]{a[i], a[j]};
      else if(sum < target) i++;
      else j--;
    }

    return new int[]{-1, -1};
  }
}
