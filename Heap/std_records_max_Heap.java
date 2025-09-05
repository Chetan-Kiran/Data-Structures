package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class std_records_max_Heap {
    public static void main(String[] args) {
        PriorityQueue<Students> maxHeap = new PriorityQueue<>(new SortByCgpa()); // new SortByRoll() roll based sorting
        maxHeap.add(new Students("Chetan", 523, 6));
        maxHeap.add(new Students("Abhi",517,7));
        maxHeap.add(new Students("vineeth", 550, 7));
        maxHeap.add(new Students("suraj", 510, 8));
        maxHeap.add(new Students("Balu", 505, 9));
        
        while(!maxHeap.isEmpty()){
            Students s = maxHeap.poll();
            System.out.println(s.roll + " " + s.name + " " + s.cgpa);
        }
    }
    public static class Students{
        String name;
        int roll, cgpa;
        Students(String name, int roll, int cgpa){
            this.name = name;
            this.roll = roll; 
            this.cgpa = cgpa;
        }
    }
    public static class SortByCgpa implements Comparator<Students>{
        public int compare(Students a, Students b){
            return b.cgpa - a.cgpa;
        }
    }
}
