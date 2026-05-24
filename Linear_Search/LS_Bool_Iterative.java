// LS_Bool_Iterative.java: Linear search returning true/false using iteration.

class LS_Bool_Iterative {
    static boolean linearSearch(int[] arr, int target) {
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50};
        int key = 30;
        System.out.println(linearSearch(data, key));
    }
}