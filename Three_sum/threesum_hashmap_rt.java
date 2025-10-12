package Three_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class threesum_hashmap_rt {
    public static void main(String[] args) {

        int[] arr ={-1,0,1,2,-1,-4};
        int target = 0,n=arr.length;

        ArrayList<int[]> res=new ArrayList<>();
	    for(int i=0;i<n-1;i++){
            HashSet<Integer> set=new HashSet<>();     //3c
            int currTarget=target-arr[i];
            for(int j=i+1;j<n;j++){
                if(set.contains(currTarget-arr[j])){
                    res.add(new int[]{arr[i],arr[j],currTarget-arr[j]});
                }
                set.add(arr[j]);
            }
        }
	    if(res.isEmpty()) System.out.println("[]");
        else for(int[] t:res) System.out.println(Arrays.toString(t));

    }
}
