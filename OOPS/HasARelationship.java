//Has-A (composition) means the class contains another class as a member, not just temporarily inside a method.
//it is a loose coupling 
/*Order can use any type of Payment without changing code.*/

class Payment{
    public void m2(){
        System.out.println("Payment is succesfull");
    }
}
class Order{
    Payment p;
    Order(Payment p){
        this.p=p;
    }
    public void m1(){
        p.m2();
        System.out.println("Order placed successfully");
    }

}
public class HasARelationship {
    public static void main(String[] args) {
        Payment Paypal=new Payment();
        Order a=new Order(Paypal);
        a.m1();
        Payment Paytm=new Payment();
        Order b=new Order(Paytm);
        b.m1();
    }
    
}
