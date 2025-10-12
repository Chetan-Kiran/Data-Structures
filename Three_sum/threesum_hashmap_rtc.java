package Three_sum;

import java.util.HashSet;

public class threesum_hashmap_rtc {
    public static void main(String[] args) {
        
        int[] arr ={-1,0,1,2,-1,-4};
        int target = 0,n=arr.length;
        int c =0;

	    for(int i=0;i<n-1;i++){
            HashSet<Integer> set=new HashSet<>();     //3c
            int currTarget=target-arr[i];
            for(int j=i+1;j<n;j++){
                if(set.contains(currTarget-arr[j])){
                    c++;
                }
                set.add(arr[j]);
            }
        }
	    System.out.println(c);
    }
}
