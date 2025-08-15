public class Overloading2 {
    public void m1(String a){
        System.out.println("String-arg");
    }
    public void m1(Object a){
        System.out.println("Object-arg");
    }
    public static void main(String[] args) {
        Overloading2 c=new Overloading2();
        c.m1(new String());
        c.m1(new Object());
        c.m1(null);//if two methods matches,it sees the child type
    }
}
//if it is not co-related then it gives,ambiguous error