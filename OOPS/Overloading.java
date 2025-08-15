public class Overloading {git 
    public void m1(int x){
       System.out.println("Int-arg");
    }
    public void m1(float x){
        System.out.println("Float-arg");
    }
    public static void main(String[] args) {
        Overloading a=new Overloading();
        a.m1(3);
        a.m1(1.2f);
        a.m1(10L);
        //a.m1(1.2);
        //a.m1(true);
    }
}
