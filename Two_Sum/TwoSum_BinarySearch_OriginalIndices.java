package Two_Sum;

import java.util.*;

public class TwoSum_BinarySearch_OriginalIndices {
    
    static class Element {
        int value, index;
        Element(int v, int i) {
            value = v;
            index = i;
        }
    }

    public static void main(String[] args) {
        
        int[] inputArr = {1, 4, 7, 2, 5, 8};
        int target = 10;
        int n = inputArr.length;

        Element[] arr = new Element[n];
        for (int i = 0; i < n; i++) arr[i] = new Element(inputArr[i], i);

        Arrays.sort(arr, (a, b) -> a.value - b.value);

        boolean found = false;
        
        for (int i = 0; i < n; i++) {
            int needed = target - arr[i].value;
            int low = i + 1, high = n - 1;

            while (low <= high) {
                int mid = (low + high) / 2;
                if (arr[mid].value == needed) {
                    System.out.println("Indices: " + arr[i].index + ", " + arr[mid].index);
                    found = true;
                }
                
                if (arr[mid].value < needed) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        if (!found) System.out.println("No pair found");
    }
}
