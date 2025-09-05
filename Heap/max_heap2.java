package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class max_heap2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap.add(5);
        minHeap.add(3);
        minHeap.add(8);
        minHeap.add(1);
        minHeap.add(4);
        minHeap.add(7);
        System.out.println("The elements in the min-heap are:");
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
    }
}
