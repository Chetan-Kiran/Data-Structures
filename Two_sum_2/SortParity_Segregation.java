// SortParity_Segregation.java
//Description: Sorts by parity by creating a new array and placing all even numbers first, followed by all odd numbers (O(N) time, O(N) space).
class SortParity_Segregation {
    public static int[] sortArrayByParity(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int index = 0;
        // Place even numbers first
        for (int num : arr) {
            if (num % 2 == 0) {
                result[index++] = num;
            }
        }
        // Place odd numbers second
        for (int num : arr) {
            if (num % 2 != 0) {
                result[index++] = num;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4, 6, 5};
        System.out.println("Original Array: " + java.util.Arrays.toString(arr));
        int[] sortedArr = sortArrayByParity(arr);
        System.out.println("Sorted by Parity: " + java.util.Arrays.toString(sortedArr));
    }
}