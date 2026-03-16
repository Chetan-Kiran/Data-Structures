package stack;

import java.util.Iterator;
import java.util.Stack;

public class travercel2 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        Iterator<Integer> it = st.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+", ");
        }
    }
}
