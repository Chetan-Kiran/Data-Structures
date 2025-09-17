// Java program to reverse a string using split method
// and handle leading and trailing dots

public class rev_str {
    public static void main(String[] args) {
        String str = "...Hello.world.java.Methods...";

        str = str.replaceAll("^\\.+", "");
        str = str.replaceAll("\\.+$", "");

        String[] rev_Strings = str.split("\\.");
        StringBuilder rev_str = new StringBuilder();
        for(int i = rev_Strings.length-1; i>=0; i--){
            rev_str.append(rev_Strings[i]);
            if(i != 0){
                rev_str.append(".");
            }
        }
        System.out.println(rev_str.toString());
    }
}
