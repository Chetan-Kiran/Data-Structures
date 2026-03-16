package stack;

import java.util.Stack;

public class travercel4 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        while (!st.empty()) {
            System.out.print(st.pop()+", ");
        }
    }
}
