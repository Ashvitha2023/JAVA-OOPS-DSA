import java.util.*;
public class CeilingNumber{
    static int func(int [] arr,int x){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>x){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return arr[start];
    }
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter a num:");
        int x=sc.nextInt();
        int result=func(arr,x);
        System.out.println(result);
    }
}