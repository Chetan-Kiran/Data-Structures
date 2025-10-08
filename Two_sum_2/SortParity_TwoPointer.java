// SortParity_TwoPointer.java
//Description: Sorts by parity in-place using the two-pointer approach (O(N) time, O(1) space).
class SortParity_TwoPointer {
    public static void sortArrayByParity(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            // If left is odd and right is even, swap them
            if (arr[left] % 2 != 0 && arr[right] % 2 == 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            } else if (arr[left] % 2 == 0) { // left is even, move on
                left++;
            } else if (arr[right] % 2 != 0) { // right is odd, move on
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4, 6, 5};
        System.out.println("Original Array: " + java.util.Arrays.toString(arr));
        sortArrayByParity(arr);
        System.out.println("Sorted by Parity (In-place): " + java.util.Arrays.toString(arr));
    }
}