import java.util.*;
import java.util.stream.StreamSupport;

import javax.swing.text.html.StyleSheet;

class Student{
    String name;
    public String fname;
    public int age;
    public int cl;
    public static int total;
    public static void mark_add(){
        System.out.println("Add two number");
    }
}

class object{
    public static void main(String[] args) {
        Student ob1 = new Student();
        ob1.name="kamal kumar";
        ob1.fname = "omsing";
        ob1.age = 21;
        ob1.cl = 11;
        
        Student.total = 10;

        Student ob2 = new Student();
        ob2.name="Aman kumar";
        ob2.fname = "ramlal";
        ob2.age = 22;
        ob2.cl = 12;

        Student ob3 = new Student();
        ob3.name="Sumit";
        ob3.fname = "XYZ";
        ob3.age = 24;
        ob3.cl = 13;

        Student ob4 = new Student();
        ob4.name="monu";
        ob4.fname = "abc";
        ob4.age = 23;
        ob4.cl = 14;

        System.out.println(ob4.name);
        
        ob4.mark_add();
    }
}