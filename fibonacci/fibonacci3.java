package fibonacci;

import java.util.ArrayList;
import java.util.Scanner;

public class fibonacci3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        ArrayList<Integer> li = fibonacci(n);

        for(int i : li){
            System.out.print(i+" ");
        }
        sc.close();
    }
    static ArrayList<Integer> fibonacci(int n){
        ArrayList<Integer> li = new ArrayList<>();
        
        int a=0,b=1,c=0;
        for(int i=1;i<=n;i++){
            li.add(a);
            c =a+b;
            a=b;
            b=c;
        }
        return li;
    }
}