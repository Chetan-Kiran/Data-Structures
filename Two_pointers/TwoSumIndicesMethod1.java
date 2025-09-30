package Two_pointers;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSumIndicesMethod1 {
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
    for(int i = 0; i < a.length - 1; i++) {
      for(int j = i + 1; j < a.length; j++) {
        if(a[i] + a[j] == target) return new  int[]{i, j};
      }
    }
    
    return new int[]{-1, -1};
  }
}
