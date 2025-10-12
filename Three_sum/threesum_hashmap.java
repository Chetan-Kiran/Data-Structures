package Three_sum;

import java.util.HashSet;


public class threesum_hashmap {
    public static void main(String[] args) {
        
        int[] arr ={-1,0,1,2,-1,-4};
        int target = 0,n=arr.length;
	    boolean exists=false;

        for(int i=0;i<n-1;i++){
            HashSet<Integer> set=new HashSet<>();
            int currTarget=target-arr[i];
            for(int j=i+1;j<n;j++){
                if(set.contains(currTarget-arr[j])){
                    exists=true;
                    break;
                }
                set.add(arr[j]);
            }
            if(exists) break;
        }
	System.out.println(exists ? "Triplet exists" : "No triplet exists");

        

    }
}
