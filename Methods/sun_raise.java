public class sun_raise {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 5, 7, 6};

        int n = arr.length;
        int max = arr[0];
        int count = 1;

        for(int i=1; i<n-1; i++){
            if(arr[i] > max){
                count++;
                max = arr[i];
            }
        }
        System.out.println(count);
    }
}
