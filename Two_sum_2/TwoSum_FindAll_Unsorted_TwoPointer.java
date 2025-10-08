// TwoSum_FindAll_Unsorted_TwoPointer.java
//Description: Finds all pairs by first sorting the array (O(N log N)) and then using the two-pointer technique (O(N)).

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class TwoSum_FindAll_Unsorted_TwoPointer {
    public static List<List<Integer>> findAllPairs(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int currentSum = arr[left] + arr[right];
            if (currentSum == target) {
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[left]);
                pair.add(arr[right]);
                result.add(pair);
                left++;
                right--;
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 8, 11, 7};
        int target = 10;
        List<List<Integer>> pairs = findAllPairs(arr, target);
        System.out.println("Input Array (will be sorted): " + java.util.Arrays.toString(arr));
        System.out.println("Target Sum: " + target);
        System.out.println("Found Pairs: " + pairs);
    }
}