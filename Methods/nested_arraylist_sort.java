// Java program to sort an array based on frequency of elements
// If two elements have same frequency then sort them based on their value

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class nested_arraylist_sort{
 public static void main(String[] args) {
   int n = 8;
   int[] arr = {4, 4, 5, 6, 5, 4, 3, 2};

    ArrayList<Integer> res = listsort(arr, n);
    System.out.println(res);
 }
 
 public static ArrayList<Integer> listsort(int[] arr, int n){
    
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i=0; i<n; i++){
        map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }

    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    
    for(Map.Entry<Integer, Integer> e : map.entrySet()){
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(e.getValue());
        temp.add(e.getKey());
        list.add(temp);
    }

    Collections.sort(list, new sort());
    ArrayList<Integer> res = new ArrayList<>();
    for(int i=0; i<list.size(); i++){
        int c = list.get(i).get(0);
        int val = list.get(i).get(1);
        for(int j=0; j<c; j++){
            res.add(val);
        }
    }

    return res;
 }

 static class sort implements Comparator<ArrayList<Integer>>{

    public int compare(ArrayList<Integer> a, ArrayList<Integer> b){
        if(a.get(0).equals( b.get(0))){
            return a.get(0) - b.get(0);
        }else{
            return b.get(0) - a.get(0);
        }
    }       
 }
}