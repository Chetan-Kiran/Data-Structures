package Two_Sum;

import java.util.*;

public class TwoSum_HashSet_Exists_Break {
    public static void main(String[] args) {
        
        int[] arr = {1, 4, 7, 2, 5, 8};
        int target = 10;

        HashSet<Integer> set = new HashSet<>();
        boolean found = false;

        for (int num : arr) {
            if (set.contains(target - num)) {
                found = true;
                break;
            }
            set.add(num);
        }

        System.out.println(found ? "Pair exists" : "No pair");
    }
}
