// RemoveDuplicates_TwoPointer.java
//Description: Removes consecutive duplicates in a string by using a two-pointer approach on a character array (O(N) time, conceptually in-place).
class RemoveDuplicates_TwoPointer {
    public static String removeDuplicates(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        char[] chars = s.toCharArray();
        int writePtr = 0; // Pointer to where the next unique character should be written
        // Start readPtr at 1, compare with writePtr
        for (int readPtr = 1; readPtr < chars.length; readPtr++) {
            if (chars[readPtr] != chars[writePtr]) {
                writePtr++;
                chars[writePtr] = chars[readPtr];
            }
        }
        return new String(chars, 0, writePtr + 1);
    }

    public static void main(String[] args) {
        String s = "AAABBCCCDDEEFFF";
        System.out.println("Original String: " + s);
        String result = removeDuplicates(s);
        System.out.println("Modified String: " + result);
    }
}