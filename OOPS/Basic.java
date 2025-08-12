//Animal is a class and creating objects
/*Java automatically assumes brand and speed refer to the instance variables of the 
current object when no local variables have the same name.So this keyword is optional*/
class Car{
    String brand;
    int speed;
    public void m1(){
        System.out.println("The brand is "+brand+" and the speed is "+speed);
    }
}
public class Basic {
    public static void main(String[] args) {
    Car c1=new Car();
    c1.brand="Audi";
    c1.speed=100;
    c1.m1();
    }
}
