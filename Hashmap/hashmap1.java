package Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmap1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(23, "chetan");
        map.put(46, "loki");
        map.put(17, "abhi");
        map.put(7, "bhargav");

        Set<Integer> set = map.keySet();
        for(int i: set){
            System.out.println(i + ": "+ map.get(i));
        }
        //no order 17: abhi
        // 23: chetan
        // 7: bhargav
        // 46: loki

        // we have to asign ids or keys to array then use loop & .contains(a[i])we can sort in this way
        
    }
}
