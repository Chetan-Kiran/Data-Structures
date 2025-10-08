// TwoSum_Count_Unsorted_HashMap.java
//Description: Counts all pairs using a HashMap (O(N)), which is the most optimal time complexity.
import java.util.HashMap;
import java.util.Map;
class TwoSum_Count_Unsorted_HashMap {
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
        int[] arr = {3, 5, 2, 8, 11, 7};
        int target = 10;
        int count = countAllPairs(arr, target);
        System.out.println("Input Array: " + java.util.Arrays.toString(arr));
        System.out.println("Target Sum: " + target);
        System.out.println("Total Pairs Count: " + count);
    }
}