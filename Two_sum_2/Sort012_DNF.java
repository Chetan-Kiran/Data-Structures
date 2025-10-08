// Sort012_DNF.java
//Description: Sorts the array using the Dutch National Flag (DNF) algorithm (3-way partitioning), which is an in-place, single-pass O(N) solution.
class Sort012_DNF {
    public static void sort012(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 2, 1, 1, 0, 2};
        System.out.println("Original Array: " + java.util.Arrays.toString(arr));
        sort012(arr);
        System.out.println("Sorted Array: " + java.util.Arrays.toString(arr));
    }
}