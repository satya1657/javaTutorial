import java;

class animal{
    String name = "animal name";
    public int legs(){
        return 4;
    }
    protected static void fun(){
        System.out.println("this is parent class");
    }
}
class cat extends animal{

}



public class driver {
    public static void main(String[] args) {
        cat obj = new cat();
        obj.fun();
        animal temp = new animal();
        animal.fun();
    }
}
