import java.util.*;
public class Pow_of_x_by_y {
    static double pow(double x,int y){
        if(y==0){
            return 1;
        }
        double half=pow(x,y/2);
        if(y%2!=0){
            return half*half*x;
        }
        else{
            return half*half;
        }
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in); 
    double x=sc.nextDouble();
    int y=sc.nextInt();
    if(y<0){
            x=1/x;
            y=-y;
    }
    double c=pow(x,y);
    System.out.println(c);   
    }
}