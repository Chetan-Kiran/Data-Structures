package Two_Sum;

public class TwoSum_BruteForce_Values_All {
    public static void main(String[] args) {
        
        int[] arr = {1, 4, 7, 2, 5, 8};
        int target = 10;
        int n = arr.length;

        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair: " + arr[i] + ", " + arr[j]);
                    found = true;
                }
            }
        }

        if (!found) System.out.println("No pair found");
    }
}
