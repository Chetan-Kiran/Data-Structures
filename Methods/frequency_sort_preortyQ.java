// Java program to sort an array based on frequency of elements
// If two elements have same frequency then sort them based on their value

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class frequency_sort_preortyQ {
    public static void main(String[] args) {
        int n =8;
        int[] arr = {4, 4, 5, 6, 5, 4, 3, 2};

        ArrayList<Integer> li = freqsort(arr, n);
        System.out.println(li);
    }

    public static ArrayList<Integer> freqsort(int[] arr, int n){
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        PriorityQueue<ArrayList<Integer>> pq = new PriorityQueue<>(new sort());
        for(Entry<Integer, Integer> e : map.entrySet()){
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(e.getValue());
            temp.add(e.getKey());
            pq.add(temp);
        }

        ArrayList<Integer> res = new ArrayList<>();
        while (!pq.isEmpty()) {
            ArrayList<Integer> x = pq.poll();
            int c = x.get(0);
            int val = x.get(1);
            for(int j=0; j<c; j++){
                res.add(val);
            }
        }
        return res;
    }

    public static class sort implements Comparator<ArrayList<Integer>>{
        public int compare(ArrayList<Integer> a, ArrayList<Integer> b){
            if(a.get(0).equals(b.get(0))){
                return a.get(1) - b.get(1);
            }else
                return b.get(0) - a.get(0);
        }
    }
}
