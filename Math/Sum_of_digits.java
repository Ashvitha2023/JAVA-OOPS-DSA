import java.util.*;
public class Sum_of_digits {
    static int sum(int a,int add){
        if(a==0){
            return add;
        }
        add+=a%10;
        return sum(a/10,add);
    }
    public static void main(String[] args) {
        int a=123;
        int b=sum(a,0);
        System.out.print(b);
    }
    
}