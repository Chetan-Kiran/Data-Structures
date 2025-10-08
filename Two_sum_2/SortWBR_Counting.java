// SortWBR_Counting.java
//Description: Sorts the character array by counting the occurrences of 'w', 'b', and 'r' and then overwriting the array (O(N) time, 2 passes). Order: white, blue, red.
class SortWBR_Counting {
    public static void sortWBR(char[] arr) {
        int countW = 0;
        int countB = 0;
        int countR = 0;
        for (char c : arr) {
            if (c == 'w') countW++;
            else if (c == 'b') countB++;
            else countR++;
        }
        int i = 0;
        for (int j = 0; j < countW; j++) {
            arr[i++] = 'w';
        }
        for (int j = 0; j < countB; j++) {
            arr[i++] = 'b';
        }
        for (int j = 0; j < countR; j++) {
            arr[i++] = 'r';
        }
    }

    public static void main(String[] args) {
        char[] arr = {'b', 'r', 'w', 'b', 'w', 'r', 'b'};
        System.out.println("Original Array: " + new String(arr));
        sortWBR(arr);
        System.out.println("Sorted Array (w, b, r): " + new String(arr));
    }
}