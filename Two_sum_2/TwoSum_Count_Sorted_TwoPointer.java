// TwoSum_Count_Sorted_TwoPointer.java
//Description: Counts all pairs in a sorted array using the two-pointer technique (O(N)).
class TwoSum_Count_Sorted_TwoPointer {
    public static int countAllPairs(int[] arr, int target) {
        int count = 0;
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int currentSum = arr[left] + arr[right];
            if (currentSum == target) {
                count++;
                left++;
                right--;
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
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