import java.util.*;
public class Power_of_two  {
    static boolean ispower(int n){
        return n>0&&(n&(n-1))==0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        boolean s=ispower(a);
        System.err.println(s);
    }
}
/*1. What does n & (n - 1) check?
It checks whether n has only one bit set. This is true only for powers of 2.

2. Why do we check n > 0?
Because 0 and negative numbers are not powers of 2, but the expression 0 & (-1) also gives 0, which is misleading. So we ensure n is positive.

3. What is the time complexity of this method?
It's O(1), since it's a direct mathematical check using bitwise operation.*/