import java.util.*;
public class SortByParity {
    static void sort(int[]arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                continue;
            }
            int j=i+1;
            while(j<arr.length&&arr[j]%2==0){
                j++;
            }
            if(j==arr.length){
                break;
            }
            int odd=arr[j];
            for(int k=j;k>i;k--){
                arr[k]=arr[k-1];
            }
            arr[i]=odd;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
