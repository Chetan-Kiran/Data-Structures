package fibonacci;

import java.util.Scanner;

public class fibonacci1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0) System.out.println(0);
        if(n == 1) System.out.println(1);

        int a=0,b=1,c=0;
        for(int i=2; i<n; i++){
            c = a+b;
            a = b;
            b = c;
        }
        System.out.println(c);
        sc.close();
    }
}
