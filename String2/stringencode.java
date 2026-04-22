package String2;

public class stringencode {
    public static void main(String[] args) {
        String str = "hello";
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(i % 2 == 0){
                sb.append((char)(ch-1));
            }
            if(i % 2 == 1){
                sb.append((char)(ch+1));
            }
        }
        System.out.println(sb.toString());
    }
}
