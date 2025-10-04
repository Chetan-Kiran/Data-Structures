package Two_Sum;

import java.util.*;

public class TwoSum_BinarySearch_Indices {
    public static void main(String[] args) {
        
        int[] arr = {1, 4, 7, 2, 5, 8};
        int target = 10;
        int n = arr.length;

        Arrays.sort(arr);

        boolean found = false;
        for (int i = 0; i < n; i++) {
            int needed = target - arr[i];
            
            int idx = Arrays.binarySearch(arr, i + 1, n, needed);
            if (idx > i) { 
                System.out.println("Indices: " + i + ", " + idx);
                found = true;
                break;
            }
        }

        if (!found) System.out.println("No pair found");
    }
}
