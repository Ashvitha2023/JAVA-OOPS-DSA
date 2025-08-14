//Has-A (composition) means the class contains another class as a member, not just temporarily inside a method.
//it is a loose coupling 
/*Order can use any type of Payment without changing code.*/
interface Payment{
    void m2();
}
class Paytm implements Payment{
    public void m2(){
        System.out.println("Payment in paytm is succesfull");
    }
}
class Card implements Payment{
    public void m2(){
        System.out.println("Payment in card is succesfull");
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
        Paytm p=new Paytm();
        Order a=new Order(p);
        a.m1();
        Card h=new Card();
        Order b=new Order(h);
        b.m1();
    }
    
}
