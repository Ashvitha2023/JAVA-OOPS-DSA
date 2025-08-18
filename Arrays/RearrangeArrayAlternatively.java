import java.util.*;
public class RearrangeArrayAlternatively {
    static void sort(int[]arr){
        int min=0;
        int max=arr.length-1;
        int mx=arr[max]+1;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i]=arr[i]+(arr[max]%mx)*mx;
                max--;
            }
            else{
                arr[i]=arr[i]+(arr[min]%mx)*mx;
                min++;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]/=mx;
        }
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
