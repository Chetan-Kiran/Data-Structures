// TwoSum_Count_Duplicates_BruteForce.java
// Description: Counts all pairs, including duplicates, using the O(N²) brute force method.
class TwoSum_Count_Duplicates_BruteForce {
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
        int[] arr = {1, 5, 5, 4, 6, 9, 5};
        int target = 10;
        int count = countAllPairs(arr, target);
        System.out.println("Input Array: " + java.util.Arrays.toString(arr));
        System.out.println("Target Sum: " + target);
        System.out.println("Total Pairs Count (including duplicates): " + count);
    }
}