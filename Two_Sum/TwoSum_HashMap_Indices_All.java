package Two_Sum;

import java.util.*;

public class TwoSum_HashMap_Indices_All {
    public static void main(String[] args) {
        
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
            }
            map.put(arr[i], i);
        }

        if (!found) System.out.println("No pair found");
    }
}