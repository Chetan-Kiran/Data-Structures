package Hashset;

import java.util.HashMap;
import java.util.Map;

public class freq2 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = {2,2,7,3,4,4,9,8,8,8};
        
        for(int i: arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue() <= 2){
                System.out.println(e.getKey());
            }
        }
    }
}
