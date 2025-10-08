// TwoSum_Count_Sorted_BruteForce.java
//Description: Counts all pairs in a sorted array using the O(N²) brute force approach.
class TwoSum_Count_Sorted_BruteForce {
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
        int[] arr = {2, 3, 5, 7, 8, 11}; // Assumed sorted input
        int target = 10;
        int count = countAllPairs(arr, target);
        System.out.println("Input Sorted Array: " + java.util.Arrays.toString(arr));
        System.out.println("Target Sum: " + target);
        System.out.println("Total Pairs Count: " + count);
    }
}