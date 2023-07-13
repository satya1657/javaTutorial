import java.util.*;

class Student{
    private int phone;
   public String name;
   public int rollno;
    int age;
    public void addition(int ph){
        this.phone = ph;
        System.out.println("this is my phone num - "+phone);
        System.out.println("I am - "+name);
    }
}

public class accessspec {
    public static void main(String[] args) {
        System.out.println("this is main");
        Student obj1 = new Student();
        obj1.name = "Kamal";
        obj1.rollno = 123;
        System.out.println(obj1.name);
        System.out.println(obj1.rollno);
        obj1.addition(27368);


        Student obj2 = new Student();
        obj2.name = "sumit";
        obj2.rollno = 343;
        System.out.println(obj2.name);
        System.out.println(obj2.rollno);
        obj2.addition(9088);
    }
}
