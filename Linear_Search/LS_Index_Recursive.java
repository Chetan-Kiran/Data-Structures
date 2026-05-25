// LS_Index_Recursive.java: Linear search returning index (-1 if not found) using recursion.

class LS_Index_Recursive {
    static int linearSearch(int[] arr, int target, int index) {
        if (index >= arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return linearSearch(arr, target, index + 1);
    }
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50};
        int key = 30;
        System.out.println(linearSearch(data, key, 0));
    }
}