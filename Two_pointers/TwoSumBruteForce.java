package Two_pointers;
import java.util.*;

public class TwoSumBruteForce {
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
    for(int i = 0; i < a.length - 1; i++) {
      for(int j = i + 1; j < a.length; j++) {
        if(a[i] + a[j] == target) return true;
      }
    }

    return false;
  }
}
