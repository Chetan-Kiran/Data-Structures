// SortWBR_DNF.java
//Description: Sorts the character array using the Dutch National Flag (DNF) algorithm (3-way partitioning) in a single in-place pass (O(N)). Order: white, blue, red.
class SortWBR_DNF {
    public static void sortWBR(char[] arr) {
        int low = 0; // Boundary for 'w'
        int mid = 0; // Current element
        int high = arr.length - 1; // Boundary for 'r'
        while (mid <= high) {
            if (arr[mid] == 'w') {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 'b') {
                mid++;
            } else { // arr[mid] == 'r'
                swap(arr, mid, high);
                high--;
            }
        }
    }
    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        char[] arr = {'b', 'r', 'w', 'b', 'w', 'r', 'b'};
        System.out.println("Original Array: " + new String(arr));
        sortWBR(arr);
        System.out.println("Sorted Array (w, b, r): " + new String(arr));
    }
}