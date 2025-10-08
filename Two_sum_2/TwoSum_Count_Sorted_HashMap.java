// TwoSum_Count_Sorted_HashMap.java
//Description: Counts all pairs in a sorted array using a HashMap (O(N)).
import java.util.HashMap;
import java.util.Map;
class TwoSum_Count_Sorted_HashMap {
    public static int countAllPairs(int[] arr, int target) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            int complement = target - num;
            if (map.containsKey(complement)) {
                count++;
            }
            map.put(num, 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 8, 11}; // Assumed sorted input
        int target = 10;
        int count = countAllPairs(arr, target);
        System.out.println("Input Sorted Array: " + java.util.Arrays.toString(arr));
        System.out.println("Target Sum: " + target);
        System.out.println("Total Pairs Count: " + count);
    }
}