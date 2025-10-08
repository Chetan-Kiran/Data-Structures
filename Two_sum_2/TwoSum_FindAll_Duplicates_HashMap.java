// TwoSum_FindAll_Duplicates_HashMap.java
//Description: Finds all pairs, including duplicates, using a HashMap with a count to ensure each element is used only once per pair (O(N)).
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class TwoSum_FindAll_Duplicates_HashMap {
    public static List<List<Integer>> findAllPairs(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            int complement = target - num;
            if (map.containsKey(complement) && map.get(complement) > 0) {
                List<Integer> pair = new ArrayList<>();
                pair.add(num);
                pair.add(complement);
                result.add(pair);
                map.put(complement, map.get(complement) - 1);
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 5, 4, 6, 9};
        int target = 10;
        List<List<Integer>> pairs = findAllPairs(arr, target);
        System.out.println("Input Array: " + java.util.Arrays.toString(arr));
        System.out.println("Target Sum: " + target);
        System.out.println("Found Pairs (including duplicates): " + pairs);
    }
}