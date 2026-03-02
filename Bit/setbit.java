// set i th bit;
//9 = 1001, i =2 shoud be 1101 => 13

package Bit;

import java.util.Scanner;

public class setbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num : ");
        int num = sc.nextInt();
        System.out.print("Enter i value : ");
        int i = sc.nextInt();

        int res = num | (1 << i);
        System.out.println("result is : "+res);
        sc.close();
    }
}
// 0r 
// 1 | 1 = 1
// 1 | 0 = 1
// 0 | 1 = 1
// 0 | 0 = 0