// Java program to reverse a string using split method

public class reverse_string {
    public static void main(String[] args) {
        String str = "Hello.world.java.Methods";

        String[] rev_arr = str.split("\\.");

        StringBuilder rev_str = new StringBuilder();
        for(int i = rev_arr.length-1; i>=0; i--){
            rev_str.append(rev_arr[i]);
            if(i != 0){
                rev_str.append(".");
            }
        }
        System.out.println(rev_str.toString());
    }
}
