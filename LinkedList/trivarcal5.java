package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class trivarcal5 {
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
        list.forEach(System.out::println);
        // list.forEach(x -> System.out.println(x));
    }
}
