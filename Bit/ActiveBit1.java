package Bit;

import java.util.Scanner;

public class ActiveBit1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        int c=0;
        while(n > 0){
            if(n % 2 == 1) c++;
            n = n /2;
        }
        System.out.println("Total Active bit are : "+c);
        sc.close();
    }
}
