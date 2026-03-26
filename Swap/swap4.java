package Swap;

public class swap4 {
    public static void main(String[] args) {
    
        int a = 5, b = 10;
        System.out.println("a=" + a + ", b=" + b);
        int[] pair = {a, b};
        a = pair[1];
        b = pair[0];
        System.out.println("a=" + a + ", b=" + b);

        // =============================
        // 2. Using Integer[] object array
        // =============================
        Integer x = 5, y = 10;
        Integer[] arr = {x, y};
        Integer temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        x = arr[0];
        y = arr[1];
        System.out.println("2. After Integer array swap: x=" + x + ", y=" + y);

        // =============================
        // 3. Using method + int[] array
        // =============================
        int[] nums = {5, 10};
        swap(nums);
        System.out.println("3. After method swap: a=" + nums[0] + ", b=" + nums[1]);
    }

    // Method to swap two elements in an int[] array
    public static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}
