package Three_sum;

import java.util.Arrays;

public class threesum_towpointer2 {
    public static void main(String[] args) {

        int[] arr ={-1,0,1,2,-1,-4};
        int target = 3,n=arr.length;
        boolean found = false;

        Arrays.sort(arr);
        int[] res={-1,-1,-1};

        for(int i=0;i<n-2;i++){
            int left=i+1,right=n-1;
            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if(sum==target){
                    res=new int[]{arr[i],arr[left],arr[right]};
                    found=true;
                    break;
                }else if(sum<target) left++;
                else right--;
            }
            if(found) break;
        }
	System.out.println(Arrays.toString(res));

    }
}
