// TwoSum_Count_Duplicates_HashMap.java
//Description: Counts all pairs, including duplicates, using a HashMap to store frequencies. This is the optimal O(N) solution
import java.util.HashMap;
import java.util.Map;
class TwoSum_Count_Duplicates_HashMap {
    public static int countAllPairs(int[] arr, int target) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            int complement = target - num;
            if (map.containsKey(complement)) {
                count += map.get(complement);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 5, 4, 6, 9, 5};
        int target = 10;
        int count = countAllPairs(arr, target);
        System.out.println("Input Array: " + java.util.Arrays.toString(arr));
        System.out.println("Target Sum: " + target);
        System.out.println("Total Pairs Count (including duplicates): " + count);
    }
}