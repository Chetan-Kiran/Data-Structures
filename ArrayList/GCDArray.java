package ArrayList;
public class GCDArray {
    
    static int findGCD(int a, int b) {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }
  
    static int findGCDOfArray(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = findGCD(result, arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {12, 24, 36, 60};
        int gcd = findGCDOfArray(arr);
        System.out.println("GCD of array elements: "+gcd);
    }
}