package Hashset;

import java.util.Collections;
import java.util.TreeSet;

public class hashset1 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        int[] arr = {2,3,2,5,7,4,6,7,5,8,4};

        for(int i : arr){
            set.add(i);
        }
        for(int x : set){
            System.out.println(x);
        }
    }
}
