import java.util.*;
public class PositionOfAnElementInInfiniteArray {
     static void index(int[]arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int tem=end+1;
            end=end+((end-start+1)*2);
            start=tem;
        }
        find(arr,target,start,end);
    }
    static void find(int[]arr,int x,int start,int end){
        int flag=0;
        int mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]==x){
                flag=1;
                break;
            }
            else if(arr[mid]>x){
                    end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        if(flag==1){
            System.out.println(mid);
        }
        else{
            System.out.println("-1");
        }
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,10};
        int target=6;
        index(arr,target);
}
