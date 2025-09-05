package Heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class std_records_Arr_max {
    public static void main(String[] args) {
        List<Students> std = new ArrayList<>();
        std.add(new Students("Chetan", 523, 6));
        std.add(new Students("Abhi",517,7));
        std.add(new Students("vineeth", 550, 7));
        std.add(new Students("suraj", 510, 8));
        std.add(new Students("Balu", 505, 9));

        ArrayList<Students> arr = sortThisList(std);
        for(Students s : arr){
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
    static ArrayList<Students> sortThisList(List<Students> List){
        PriorityQueue<Students> maxHeap = new PriorityQueue<>( new SortByCgpa()); // new SortByCgpa() cgpa based sorting

        for(Students i : List){
            maxHeap.add(i);
        }
        ArrayList<Students> arr = new ArrayList<>();
        while(!maxHeap.isEmpty()){
            arr.add(maxHeap.poll());
        }
        return arr;
    }
    static class SortByCgpa implements Comparator<Students>{
        public int compare(Students a, Students b){
            return Integer.compare(b.cgpa, a.cgpa);
        }
    }
}
