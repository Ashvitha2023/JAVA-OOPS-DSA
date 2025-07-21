import java.util.*;
public class String_length {
    static int length(String a){
        if(a.equals("")){
            return 0;
        }
        return 1+length(a.substring(1));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int c=length(a);
        System.out.println(c);
    }
}