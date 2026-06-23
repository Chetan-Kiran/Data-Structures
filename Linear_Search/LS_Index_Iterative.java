// LS_Index_Iterative.java: Linear search returning index (-1 if not found) using iteration.

class LS_Index_Iterative {
    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50};
        int key = 30;
        System.out.println(linearSearch(data, key));
    }
}