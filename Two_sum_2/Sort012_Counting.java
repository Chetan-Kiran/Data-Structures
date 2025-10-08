// Sort012_Counting.java
//Description: Sorts the array by counting the occurrences of 0, 1, and 2, and then overwriting the array (O(N) time, 2 passes).
class Sort012_Counting {
    public static void sort012(int[] arr) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int x : arr) {
            if (x == 0) count0++;
            else if (x == 1) count1++;
            else count2++;
        }
        int i = 0;
        for (int j = 0; j < count0; j++) {
            arr[i++] = 0;
        }
        for (int j = 0; j < count1; j++) {
            arr[i++] = 1;
        }
        for (int j = 0; j < count2; j++) {
            arr[i++] = 2;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 2, 1, 1, 0, 2};
        System.out.println("Original Array: " + java.util.Arrays.toString(arr));
        sort012(arr);
        System.out.println("Sorted Array: " + java.util.Arrays.toString(arr));
    }
}