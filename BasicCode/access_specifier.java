import java.util.*;

class Bank{
    public String name;  // public member variable
    private int total_amount=100;
    public int add(int n1,int n2){ // public member function
        return n1+n2+total_amount;
    }
}

class access_specifier{
    // public
    public static void main(String[] args) {
        Bank obj = new Bank();  //create object of a class
        obj.name = "Priyanshu";
        System.out.println(obj.name);
        System.out.println(obj.add(8, 12));
        // obj.total_amount=86876;
    }

}

