package stack;

import java.util.Stack;

public class travercel3 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        for(int i=0; i<st.size(); i++){
            System.out.print(st.get(i)+", ");
        }
    }
}
