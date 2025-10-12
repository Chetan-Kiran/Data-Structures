package Three_sum;

import java.util.Arrays;

public class threesum_towpointer_retc {
    public static void main(String[] args) {
        
        int[] arr ={-1,0,1,2,-1,-4};
        int target = 0,n=arr.length;

        Arrays.sort(arr);
        int c=0; 

        for(int i=0;i<n-2;i++){
            int left=i+1,right=n-1;
            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if(sum==target){
                    c++;
                    left++;
                    right--;
                }else if(sum<target) left++;
                else right--;
            }
        }

        System.out.println(c);
    }
}
