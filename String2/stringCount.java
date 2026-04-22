package String2;

public class stringCount {
    public static void main(String[] args) {
        String str = "aaabbbbccdddaaa";
        StringBuilder sb = new StringBuilder();
        int count = 1;
        
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) != str.charAt(i-1)){
                sb.append(str.charAt(i-1));
                sb.append(count);
                count = 1;
            }else{
                count++;
            }
        }
        sb.append(str.charAt(str.length()-1));
        sb.append(count);
        System.out.println(sb.toString());
    }
}
