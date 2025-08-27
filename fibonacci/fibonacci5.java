package fibonacci;

import java.util.Scanner;

public class fibonacci5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n == 0) System.out.println(0);
        if(n == 1) System.out.println(1);

        int a=0,b=1,c=0;
        
        while(true){
            c =a+b;
            if(c > n){
                System.out.println("False");
                break;
            }
            if(c == n){
                System.out.println("True");
                break;
            }   
            a = b;
            b = c;
        }
        sc.close();
    }
}
