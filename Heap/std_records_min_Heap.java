package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class std_records_min_Heap {
    public static void main(String[] args) {
        PriorityQueue<Students> minHeap = new PriorityQueue<>( new SortByRoll()); // new SortByCgpa() cgpa based sorting
        minHeap.add(new Students("Chetan", 523, 6));
        minHeap.add(new Students("Abhi",517,7));
        minHeap.add(new Students("vineeth", 550, 7));
        minHeap.add(new Students("suraj", 510, 8));
        minHeap.add(new Students("Balu", 505, 9));

        while(!minHeap.isEmpty()){
            Students s = minHeap.poll();
            System.out.println(s.roll + " " + s.name + " " + s.cgpa);
        }
    }
    static class Students{
        String name;
        int roll, cgpa;
        Students(String name, int roll, int cgpa){
            this.name = name;
            this.roll = roll; 
            this.cgpa = cgpa;
        }
    }
    static class SortByRoll implements Comparator<Students>{
        public int compare(Students a, Students b){
            return a.roll - b.roll;
        }
    }
    static class SortByCgpa implements Comparator<Students>{
        public int compare(Students a, Students b){
            return b.cgpa - a.cgpa;
        }
    }
}
