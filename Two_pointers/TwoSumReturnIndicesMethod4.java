package Two_pointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSumReturnIndicesMethod4 {
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
    HashMap<Integer, Integer> hm = new HashMap<>();
    for(int i = 0; i < a.length; i++) {
      int num = a[i];
      int elem = target - num;
      if(hm.containsKey(elem)) return new int[]{i, hm.get(elem)};
      hm.put(num, i);
    }

    return new int[]{-1, -1};
  }
}
