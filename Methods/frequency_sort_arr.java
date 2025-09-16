
import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Map;

public class frequency_sort_arr {
    public static void main(String[] args) {
        int n = 8;
        int[] arr = {4, 4, 5, 6, 5, 4, 3, 2};

        ArrayList<Integer> res = freqsort(arr, n);
        System.out.println(res);
    }

    public static ArrayList<Integer> freqsort(int[] arr, int n){

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(new sort());
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            int[] a = new int[2];
            a[0] = e.getValue();
            a[1] = e.getKey();
            pq.add(a);
        }

        ArrayList<Integer> res = new ArrayList<>();
        while(!pq.isEmpty()){
            int[] a = pq.poll();
            int freq = a[0];
            int value = a[1];
            for(int i=0; i<freq; i++){
                res.add(value);
            }
        }

        return res;
    }

    public static class sort implements Comparator<int[]> {
        public int compare(int[] a, int[] b){
            if(a[0] == b[0]){
                return a[1] - b[1];
            }else{
                return b[0] - a[0];
            }
        }    
    }
}
