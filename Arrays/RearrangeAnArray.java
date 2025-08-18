//Rearrange an Array so that arr[i] becomes arr[arr[i]]
import java.util.*;
public class RearrangeAnArray {
    static void rearrange(int[]arr){
        int mx=arr.length;
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+(arr[arr[i]]%mx)*mx;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]/=mx;
        }
    }
    public static void main(String[] args) {
        int []arr={4,0,2,1,3};
        rearrange(arr);
        System.err.println(Arrays.toString(arr));
    }
}
