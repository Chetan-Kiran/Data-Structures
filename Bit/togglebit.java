package Bit;

import java.util.Scanner;

public class togglebit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num : ");
        int num = sc.nextInt();
        System.out.print("Enter i value : ");
        int i = sc.nextInt();

        int x = 1 << i;
        int res = num ^ x;
        System.out.println("Result is : "+res);
        sc.close();
    }
}

//xor
// 1 ^ 1 = 0
// 1 ^ 0 = 1
// 0 ^ 1 = 1
// 0 ^ 0 = 0