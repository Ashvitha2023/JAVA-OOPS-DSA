import java.util.*;
public class TwoSum {
    public static int[] BruteForce(int[] arr,int tar){ // TC:O(n^2) || SC:O(1)
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==tar){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static int[] Optimized(int[] arr,int tar){ //TC:O(n) || SC:O(n)
        Map<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
             int find=tar-arr[i];
             if(hm.containsKey(find)){
                    return new int[]{i,hm.get(find)};
             }
             hm.put(arr[i],i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int tar=9;
        int[] res=BruteForce(arr,tar);
        int[] res1=Optimized(arr,tar);
        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(res1));
    }
}
