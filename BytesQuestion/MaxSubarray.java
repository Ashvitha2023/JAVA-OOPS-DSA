//https://leetcode.com/problems/maximum-subarray/description/
import java.util.*;
public class MaxSubarray {
    public static int brute(int[] arr){  //TC:O(n^2) || SC:O(1)
        int sum=0;
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum>max){
                    max=sum;
                }
            }
        }
        return max;
    }
    public static int optimized(int[] arr){   //TC:O(n) || SC:O(1)
          int cur=0;
          int max=arr[0];
          for(int i=0;i<arr.length;i++){
            cur+=arr[i];
            if(cur>max) max=cur;
            if(cur<0) cur=0;
          }
          return max;
    }
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int res=brute(arr);
        int res1=optimized(arr);
        System.out.println(res);
        System.out.println(res1);
    }
}
