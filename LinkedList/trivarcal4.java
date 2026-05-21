package LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class trivarcal4 {
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
        ListIterator<String> lit = list.listIterator();
        while(lit.hasNext()){
            System.out.println(lit.next());
        }
    }
}
