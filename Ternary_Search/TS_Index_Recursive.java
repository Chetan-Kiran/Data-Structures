package Ternary_Search;

// TS_Index_Recursive.java: Ternary search returning index (-1 if not found) using recursion.

class TS_Index_Recursive {
    static int ternarySearch(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid1 = low + (high - low) / 3;
        int mid2 = high - (high - low) / 3;
        if (arr[mid1] == target) {
            return mid1;
        }
        if (arr[mid2] == target) {
            return mid2;
        }
        if (target < arr[mid1]) {
            return ternarySearch(arr, target, low, mid1 - 1);
        } else if (target > arr[mid2]) {
            return ternarySearch(arr, target, mid2 + 1, high);
        } else {
            return ternarySearch(arr, target, mid1 + 1, mid2 - 1);
        }
    }
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50, 60, 70};
        int key = 50;
        System.out.println(ternarySearch(data, key, 0, data.length - 1));
    }
}
