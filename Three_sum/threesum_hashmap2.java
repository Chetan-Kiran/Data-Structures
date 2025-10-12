package Three_sum;

import java.util.Arrays;
import java.util.HashSet;

public class threesum_hashmap2 {
    public static void main(String[] args) {
        
        int[] arr ={-1,0,1,2,-1,-4};
        int target = 3,n=arr.length;

        int[] res={-1,-1,-1};
        boolean found=false;
	for(int i=0;i<n-1;i++){
            HashSet<Integer> set=new HashSet<>();
            int currTarget=target-arr[i];
            for(int j=i+1;j<n;j++){
                if(set.contains(currTarget-arr[j])){
                    res=new int[]{arr[i],arr[j],currTarget-arr[j]};
                    found=true;
                    break;
                }
                set.add(arr[j]);
            }
            if(found) break;
        }
	System.out.println(Arrays.toString(res));

        

    }
}
