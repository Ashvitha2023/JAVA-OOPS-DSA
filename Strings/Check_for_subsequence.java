//https://www.geeksforgeeks.org/problems/check-for-subsequence4930/1
import java.util.*;
public class Check_for_subsequence{
static boolean check(String a,String b){
    int c=-1;
    int j=0;
    for(int i=0;i<b.length();i++){
        if(i>c&&b.charAt(i)==a.charAt(j)){
            c=i;
            j++;
        }
        if(j>a.length()){
            return true;
        }
    }
    return false;
}
