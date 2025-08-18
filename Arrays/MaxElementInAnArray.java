import java.util.*;
public class MaxElementInAnArray {
    static int maxi(int[]arr,int i){
        if(i==arr.length-1){
            return arr[i];
        }
        int c=maxi(arr,i+1);
        return Math.max(c,arr[i]);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arr={1,4,7,6,12,9};
        int res=maxi(arr,0);
        System.err.println(res);
    }
}
MaxElementInAnArray