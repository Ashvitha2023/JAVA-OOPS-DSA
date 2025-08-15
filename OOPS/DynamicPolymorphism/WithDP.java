interface X{
    public void service();
}
class A implements X{
    public void service(){
        System.out.println("A-Service");
    }
}
class B implements X{
    public void service(){
        System.out.println("B-Service");
    }
}
public class WithDP {
    public static void main(String[] args) {
        X ref = (X) Class.forName(args[0]).newInstance();
        ref.service();  // JVM decides which service() to call
    }
}
/*Flexible — can add new classes without changing main code.
Reusable — same reference ref can point to different child objects.
Runtime decision — correct overridden method executes automatically. */