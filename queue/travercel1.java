package queue;

import java.util.LinkedList;
import java.util.Queue;

public class travercel1 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        for(int i : q){
            System.out.print(i+", ");
        }
    }
}
