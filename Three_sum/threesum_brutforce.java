package Three_sum;

import java.util.Arrays;

public class threesum_brutforce {
    public static void main(String[] args) {
        
        int[] arr ={-1,0,1,2,-1,-4};
        int target = 0,n=arr.length;
        boolean exists = false;
        
        Arrays.sort(arr);

         for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        exists = true;
                        break;
                    }
                }
                if(exists) break;
            }
            if(exists) break;
        }
	System.out.println(exists ? "Triplet exists" : "No triplet exists");

    }
}
