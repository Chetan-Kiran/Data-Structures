package String2;

public class stringoctal {
    public static void main(String[] args) {
        String str = "aaaaaaaaaaaaabbbbbbbbcccccc";
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) != str.charAt(i-1)){
                sb.append(str.charAt(i-1));
                sb.append(Integer.toOctalString(count));
                count = 1;
            }else{
                count++;
            }
        }
        sb.append(str.charAt(str.length()-1));
        sb.append(Integer.toOctalString(count));
        System.out.println(sb.toString());
    }
}
