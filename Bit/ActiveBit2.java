package Bit;

import java.util.Scanner;

public class ActiveBit2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        int c=0;
        while(n > 0){
            c = c+ (n & 1);
            n = n >> 1;
        }
        System.out.println("Total Active bit are : "+c);
        sc.close();
    }
}
