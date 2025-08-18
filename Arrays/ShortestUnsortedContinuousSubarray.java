import java.util.*;
public class ShortestUnsortedContinuousSubarray {
    static int sub(int[]nums){
         int[]a=Arrays.copyOf(nums,nums.length);
        Arrays.sort(nums);
        int left=-1;
        int right=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]!=nums[i]){
                if(left==-1){
                left=i;
                }
                right=i;
            }
        }
        if(left!=-1){
            return (right-left)+1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int c=sub(arr);
        System.out.println(c);;
    }
}
