//Typically used for one-time, temporary tasks like button clicks, temporary behavior, or short background threads.
interface Payment{
      public void pay();
}
public class AnonymousClass {
    Payment a=new Payment(){
        public void pay(){
            System.out.println("Paid successfully");
        }
    }
    a.pay();
    
}
