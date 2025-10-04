package Two_Sum;

import java.util.*;

public class TwoSum_TwoPointer_OriginalIndices {

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
        int left = 0, right = n - 1;

        while (left < right) {
            int sum = arr[left].value + arr[right].value;
            if (sum == target) {
                System.out.println("Indices: " + arr[left].index + ", " + arr[right].index);
                found = true;
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        if (!found) System.out.println("No pair found");
    }
}
