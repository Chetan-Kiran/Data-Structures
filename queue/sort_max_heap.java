package queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class sort_max_heap {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2, 7};
        int [] sortedArr = heapsort(arr);
        for(int i : sortedArr){
            System.out.print(i + " ");
        }
    }
    public static int[] heapsort(int[] arr){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : arr){
            maxHeap.add(i);
        }
        int i = 0;
        while(!maxHeap.isEmpty()){
            arr[i++] = maxHeap.poll();
        }
        return arr;
    }
}
