//creation of object when it is on demand
class Test{
    private static Test instance;
    private Test(){

    }
    public static synchronized Test getInstance(){
        if(instance==null){
            instance=new Test();
        }
        return instance;
    }
}
public class LazyInitialisation {
    public static void main(String[] args) {
        Test a=Test.getInstance();
        Test b=Test.getInstance();
        System.out.println(a==b);
    }
}
