package Two_pointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoSumReturnIndicesMethod3 {
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
        HashMap<Integer, List<Integer>> hm = new HashMap<>();
        for(int i = 0; i < a.length; i++) {
            hm.computeIfAbsent(a[i], k -> new ArrayList<>()).add(i);
        }

        int[] sorted = a.clone();
        
        Arrays.sort(sorted);
        int n = sorted.length;

        for(int i = 0; i < n; i++) {
            int complement = target - sorted[i];
            int pos = binarySearch(sorted, n, complement);
            if(pos != -1 && pos != i) {
                int idx1 = hm.get(sorted[i]).remove(0);
                int idx2 = hm.get(sorted[pos]).remove(0);
                return new int[]{idx1, idx2};
            }
        }
        return new int[]{-1, -1};
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
