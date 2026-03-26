package Swap;

import java.util.Scanner;

public class swap1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a: ");
        int a = sc.nextInt();
        System.out.print("Enter the b: ");
        int b = sc.nextInt();
        swap(a, b);
        sc.close();
    }
    public static void swap(int a, int b){
        System.out.println("a = "+a+", b = "+b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = " +a+", b = "+b);
    }
}