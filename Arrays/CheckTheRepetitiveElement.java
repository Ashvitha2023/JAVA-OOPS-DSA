import java.util.*;
public class CheckTheRepetitiveElement {
    static int check(int[]arr){
        HashSet<Integer>a=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(a.contains(arr[i])){
                return arr[i];
            }
            a.add(arr[i]);
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int d=check(arr);
        System.out.println(d);
    }
}



