// TwoSum_FindAll_Duplicates_BruteForce.java
//Description: Finds all pairs, including duplicates, using the O(N²) brute force method.
import java.util.ArrayList;
import java.util.List;
class TwoSum_FindAll_Duplicates_BruteForce {
    public static List<List<Integer>> findAllPairs(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    List<Integer> pair = new ArrayList<>();
                    pair.add(arr[i]);
                    pair.add(arr[j]);
                    result.add(pair);
                }
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