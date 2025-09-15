//Iterator is used for all structure
//Iterator is used for both removel and retrieval
//Iterator can only traverse in forward direction
import java.util.*;
public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String>al=new ArrayList<>();
        al.add("Ashvitha");
        al.add("Thanya");
        al.add("Raji");
        al.add("Gokul");
        al.add("Kesavan");
        Iterator<String> i=al.iterator();
        while(i.hasNext()){
            if(i.next().equals("Thanya")){
                i.remove();
            }
        }
        System.out.println(al);
    }
}
