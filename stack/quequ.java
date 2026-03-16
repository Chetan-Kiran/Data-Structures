package stack;
import java.util.*;

public class quequ {
    static Stack<Integer> st1 = new Stack<>();
    static Stack<Integer> st2 = new Stack<>();
    public static void main(String[] args) {
        //quequ using 2 stacks
        Scanner sc = new Scanner(System.in);
        System.out.println("select the operetion you want :");
        System.out.println("1. add an element to the quequ");
        System.out.println("2. remove an element from the quequ");
        System.out.println("3. display the quequ");
        System.out.println("4. print the quequ");
        System.out.println("5. exit");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("enter the element you want to add :");
                int element = sc.nextInt();
                enqueue(element);
                break;
            case 2:
                dequeue();
                break;
            case 3:
                display();
                break;
            case 4:
                print();
                break;
            case 5:
                System.out.println("exiting the program");
                break;
            default:
                break;
        }
        sc.close();
    }
    public static void enqueue(int element){
        st1.push(element);
    }

    public static void dequeue(){
        if(st1.isEmpty() && st2.isEmpty()){
            System.out.println("quequ is empty");
            return;
        }
        if(st2.isEmpty()){
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
        }
        st2.pop();
    }

    public static void display(){
        if(st1.isEmpty() && st2.isEmpty()){
            System.out.println("quequ is empty");
        }
        if(!st2.isEmpty()){
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }
        st2.peek();
    }

    public static void print(){
        for(int i=st2.size()-1; i>=0; i--){
            System.out.print(st2.get(i)+ " ");
        }
        for(int i=0; i<st1.size(); i++){
            System.out.print(st1.get(i)+" ");
        }
        System.out.println();
    }
}

