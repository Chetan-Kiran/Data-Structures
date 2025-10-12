package Three_sum;

import java.util.ArrayList;
import java.util.Arrays;

public class threesum_brutforce_ret {
    public static void main(String[] args) {

        int[] arr ={-1,0,1,2,-1,-4};
        int target = 0,n=arr.length;
        
        Arrays.sort(arr);
        ArrayList<int[]> res=new ArrayList<>();

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        res.add(new int[]{arr[i],arr[j],arr[k]});
                    }
                }
            }
        }

        if(res.isEmpty()) System.out.println("[]");
        else{
            for(int[] t:res) System.out.println(Arrays.toString(t));
        }

    }
}
