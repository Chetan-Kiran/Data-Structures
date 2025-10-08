// TwoSum_Count_Unsorted_BruteForce.java
//Description: Counts all pairs that sum up to the target using a nested loop (O(N²))
class TwoSum_Count_Unsorted_BruteForce {
    public static int countAllPairs(int[] arr, int target) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    count++;
                }
            }
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