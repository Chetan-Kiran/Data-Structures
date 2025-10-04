package Two_Sum;

import java.util.Scanner;
public class Brute_Force_Finding_Indices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int target = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Indices: " + i + ", " + j);
                    found = true;
                }
            }
        }

        if (!found) System.out.println("No pair found");
        sc.close();
    }
}