import java.util.*;
public class MoveZeroesToEnd {
    static void movezeroes(int[]arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
    int []arr={1,0,4,5,0};
    movezeroes(arr);
    System.out.print(Arrays.toString(arr));
    }
}
