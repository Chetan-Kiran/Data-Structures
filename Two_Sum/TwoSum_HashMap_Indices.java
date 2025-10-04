package Two_Sum;

import java.util.*;

public class TwoSum_HashMap_Indices {
    public static void main(String[] args) {
        // Hardcoded Input
        int[] arr = {1, 4, 7, 2, 5, 8};
        int target = 10;
        int n = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                System.out.println("Indices: " + map.get(complement) + ", " + i);
                found = true;
                // break; // Uncomment to stop after the first pair
            }
            map.put(arr[i], i);
        }

        if (!found) System.out.println("No pair found");
    }
}
