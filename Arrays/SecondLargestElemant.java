import java.util.*;
public class SecondLargestElemant {
    static int secondLargest(int[]arr){
        int max=Integer.MIN_VALUE;
        int second=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
             if(arr[i]>max){
                second=max;
                max=arr[i];
             }
             else if(arr[i]>second&&arr[i]!=max){
                  second=arr[i];
             }
        }
        if(second==Integer.MIN_VALUE){
            return -1;
        }
        return second;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int a=secondLargest(arr);
        System.err.println(a);
    }
}
