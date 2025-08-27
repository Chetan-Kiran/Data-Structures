package fibonacci;

import java.util.Scanner;

public class fibonacci6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if(isfeb(n)){
            System.out.println(n + " is a Fibonacci number.");
        }else{
            System.out.println(n + " is not Fibonacci number.");
        }
        sc.close();
    }
    static boolean isfeb(int n){
        return isroot(5*n*n + 4) || isroot(5*n*n-4);
    }
    static boolean isroot(int n){
        int s = (int) Math.sqrt(n);
        return (s * s == n);
    }
}
