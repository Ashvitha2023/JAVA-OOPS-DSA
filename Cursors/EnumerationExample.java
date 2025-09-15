//Enumeration is used only in legal classes like Vector,HashTable,Stack
//Enumeration is only used for retrieval

import java.util.*;
public class EnumerationExample {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        v.add(6);
        Enumeration <Integer> e=v.elements();
        while(e.hasMoreElements()){
            Integer num=(Integer)e.nextElement(); //return type will be Object
            System.out.println(num);
        }
    }
}
