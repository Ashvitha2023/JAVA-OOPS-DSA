//Class decides exactly what type to use
//“Order forces a Paytm"
class Payment{
    public void m2(){
        System.out.println("Payment is successfully");
    }
}
class Order{
    public void m1(){
        Payment paytm=new Payment();//hard coding
        paytm.m2();
        System.out.println("Order is placed successfully");
    }
}
public class TightCoupling {
    public static void main(String[] args) {
        Order a=new Order();
        a.m1();
    }
}
