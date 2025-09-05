package Heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class min_heap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0; i<n; i++){
            System.out.println("Enter the " + (i+1) + " element");
            minHeap.add(sc.nextInt());
        }
        System.out.println("The elements in the min-heap are:");
        while(!minHeap.isEmpty()){
            System.out.print(minHeap.poll() + " ");
        }
        sc.close();
    }
}
