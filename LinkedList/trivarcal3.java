package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class trivarcal3 {
    public static void main(String[] args) {
        
        List<String> list = new LinkedList<>();
        list.add("Doraemon");
        list.add("Nobita");
        list.add("Shizuk");
        list.add("Gian");
        list.add("Suneo");
        listloop(list);
    }
    public static void listloop(List<String> list){
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
