//creation of object during class loading
class Test{
    private static Test instance=new Test();
    private Test(){

    }
    public static Test getInstance(){
        return instance;
    }
}
class EarlyInitialisation{
    public static void main(String[] args) {
        Test a=Test.getInstance();
       Test b=Test.getInstance();
       System.out.println(a==b);
    }
}