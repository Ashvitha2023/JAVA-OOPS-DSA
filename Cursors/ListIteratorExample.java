import java.util.*;
public class ListIteratorExample {
    public static void main(String[] args) {
        ArrayList<String>al=new ArrayList<>();
        al.add("Ashvitha");
        al.add("Thanya");
        al.add("Gokul");
        al.add("Raji");
        ListIterator<String> i=al.listIterator();

        //Forward traversal
        while(i.hasNext()){
            System.out.println(i.next());
        }

        //reversal traversal
        while(i.hasPrevious()){
            System.out.println(i.previous());
        }

        while(i.hasNext()){
            String s=i.next();
            if(s.equals("Thanya")){
                i.remove();
            }
            if(s.charAt(0)=='A'){
                i.set("Anonymous");
            }
            if(s.equals("Raji")){
                i.add("Kesavan");
            }
        }
        System.out.println(al);
    }
}
