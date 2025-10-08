// TwoSum_FindAll_Sorted_HashMap.java
//Description: Finds all pairs in a sorted array using a HashMap (O(N)).

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class TwoSum_FindAll_Sorted_HashMap {
    public static List<List<Integer>> findAllPairs(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            int complement = target - num;
            if (map.containsKey(complement)) {
                List<Integer> pair = new ArrayList<>();
                pair.add(num);
                pair.add(complement);
                result.add(pair);
            }
            map.put(num, 1);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 8, 11}; // Assumed sorted input
        int target = 10;
        List<List<Integer>> pairs = findAllPairs(arr, target);
        System.out.println("Input Sorted Array: " + java.util.Arrays.toString(arr));
        System.out.println("Target Sum: " + target);
        System.out.println("Found Pairs: " + pairs);
    }
}