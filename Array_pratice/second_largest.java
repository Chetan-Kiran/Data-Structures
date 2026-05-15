package Array_pratice;

public class second_largest {
    public static void main(String[] args) {
        int[] arr  = {11,33,8,7,5,44};

        int first = -1;
        int second = -1;

        for(int i = 0 ; i<arr.length; i++){
            if(arr[i] > first){
                second = first;
                first = arr[i];
            }else if(arr[i] < first && arr[i] > second){
                second = arr[i];
            }    
        }

        System.out.println(first);
        System.out.println(second);

    }
}
