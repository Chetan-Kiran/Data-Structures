package fibonacci;

import java.util.Scanner;

public class fibonacci4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n == 0) System.out.println(0);
        if(n == 1) System.out.println(1);

        int a=0,b=1,c=0;
        
        for(int i=1; i<=n; i++){
            System.out.print(a+" ");
            if(c > n) break;
            c = a+b;
            a =b;
            b =c;
        }
        sc.close();
    }
}
