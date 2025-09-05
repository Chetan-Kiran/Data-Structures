package Heap;

import java.util.PriorityQueue;

public class sort_min_heap {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2, 7};
        int [] sortedArr = heapsort(arr);
        for(int i : sortedArr){
            System.out.print(i + " ");
        }
    }
    public static int[] heapsort(int[] arr){
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for(int i : arr){
            minheap.add(i);
        }
        int i = 0;
        while(!minheap.isEmpty()){
            arr[i++] = minheap.poll();
        }
        return arr;
    }
}