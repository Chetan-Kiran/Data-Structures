package Two_Sum;

import java.util.*;

public class TwoSum_TwoPointer_Values_Break {
    public static void main(String[] args) {
        // Hardcoded Input
        int[] arr = {1, 4, 7, 2, 5, 8};
        int target = 10;
        int n = arr.length;
        
        // Array must be sorted for Two-Pointer
        Arrays.sort(arr); 

        boolean found = false;
        int left = 0, right = n - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println("Pair: " + arr[left] + ", " + arr[right]);
                found = true;
                break; 
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        if (!found) System.out.println("No pair found");
    }
}
