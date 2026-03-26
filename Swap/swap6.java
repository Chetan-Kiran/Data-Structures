package Swap;

public class swap6 {
    public static void main(String[] args) {
    
        int[] nums = {5, 10};
        System.out.println("a=" + nums[0] + ", b=" + nums[1]);
        swap(nums);
        System.out.println("a=" + nums[0] + ", b=" + nums[1]);
    }

    public static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}
