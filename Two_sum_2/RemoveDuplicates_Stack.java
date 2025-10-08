// RemoveDuplicates_Stack.java
//Description: Removes consecutive duplicates using a Stack. Only pushes a character if it's different from the top of the stack (O(N) time, O(N) space).
import java.util.Stack;
class RemoveDuplicates_Stack {
    public static String removeDuplicates(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty() || stack.peek() != c) {
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "AAABBCCCDDEEFFF";
        System.out.println("Original String: " + s);
        String result = removeDuplicates(s);
        System.out.println("Modified String: " + result);
    }
}