package Two_Sum;

import java.util.*;

public class TwoSum_HashSet_Values_All {
    public static void main(String[] args) {
        
        int[] arr = {1, 4, 7, 2, 5, 8};
        int target = 10;

        HashSet<Integer> set = new HashSet<>();
        boolean found = false;

        for (int num : arr) {
            if (set.contains(target - num)) {
                System.out.println("Pair: " + num + ", " + (target - num));
                found = true;
            }
            set.add(num);
        }

        if (!found) System.out.println("No pair found");
    }
}
