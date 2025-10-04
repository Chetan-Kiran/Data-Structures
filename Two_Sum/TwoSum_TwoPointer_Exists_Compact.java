package Two_Sum;

import java.util.*;

public class TwoSum_TwoPointer_Exists_Compact {
    public static void main(String[] args) {
        
        int[] arr = {1, 4, 7, 2, 5, 8};
        int target = 10;
        int n = arr.length;

        Arrays.sort(arr);

        int left = 0, right = n - 1;
        boolean found = false;
        
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) { 
                found = true; 
                break; 
            } else if (sum < target) {
                left++; 
            } else {
                right--; 
            }
        }

        System.out.println(found ? "Pair exists" : "No pair");
    }
}