// TwoSum_Count_Unsorted_TwoPointer.java
//Description: Counts all pairs by first sorting the array (O(N log N)) and then using the two-pointer technique (O(N)).
import java.util.Arrays;
class TwoSum_Count_Unsorted_TwoPointer {
    public static int countAllPairs(int[] arr, int target) {
        Arrays.sort(arr);
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
        int[] arr = {3, 5, 2, 8, 11, 7};
        int target = 10;
        int count = countAllPairs(arr, target);
        System.out.println("Input Array (will be sorted): " + java.util.Arrays.toString(arr));
        System.out.println("Target Sum: " + target);
        System.out.println("Total Pairs Count: " + count);
    }
}