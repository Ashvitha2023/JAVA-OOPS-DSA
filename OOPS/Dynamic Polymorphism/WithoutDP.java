/*No flexibility.
To add a new class C, you must modify main() code.*/
//You must change the code every time a new class is added.

class A{
        public void m1(){
            System.out.println("A-Service");
        }
    }
class B{
        public void m1(){
            System.out.println("B-Service");
        }
    }
public class WithoutDP{
    public static void main(String[] args) {
        A a=new A();
        a.m1();
        B b=new B();
        b.m1();
    }
}
