//Both Admin user and Regular user are the types of users
//Is-a: When one class is a subtype of another (inheritance).
class User{
    public void login(){
        System.out.println("User is LoggedIn");
    }
}
class AdminUser extends User{
    public void login(){
        System.out.println("Admin panel is accessed");
    }
}
class RegularUser extends User{
    public void login(){
        System.out.println("Browsing content");
    }
}
public class IsARelationship {
    public static void main(String[] args) {
        //Child reference,child object
        AdminUser a=new AdminUser();
        a.login();
        //Parent refernce,parent object
        User b=new User();
        b.login();
        //Parent refernce,child object
        User c=new RegularUser();
        c.login();
    }
}
//In overriding,it sees child object
