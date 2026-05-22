package LinkedList;

import java.util.*;

public class trivarcal1 {
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
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + ", ");
        }
    }
}
