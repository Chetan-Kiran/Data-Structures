// LS_Bool_Recursive.java: Linear search returning true/false using recursion.

class LS_Bool_Recursive {
    static boolean linearSearch(int[] arr, int target, int index) {
        if (index >= arr.length) {
            return false;
        }
        if (arr[index] == target) {
            return true;
        }
        return linearSearch(arr, target, index + 1);
    }
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50};
        int key = 30;
        System.out.println(linearSearch(data, key, 0));
    }
}