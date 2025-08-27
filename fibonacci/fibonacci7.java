package fibonacci;

import java.util.Scanner;

public class fibonacci7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if(n == 0) System.out.println(0);
        else if(n == 1) System.out.println(1);
        else{
            int a = 0, b = 1, sum = a + b;
            for(int i = 2; i < n; i++) {
                int next = a + b;
                sum += next;
                a = b;
                b = next;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
