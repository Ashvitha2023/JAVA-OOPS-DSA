public class Factorial {
    static int fact(int a,int re){
       if(a==1){
        return re;
       }
       return fact(a-1,re*a);
    }
    public static void main(String[] args) {
        int a=5;
        int c=fact(a,1);
        System.out.println(c);
    }
}