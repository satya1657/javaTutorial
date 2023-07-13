import java.util.*;
public class staticcode {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        Employee emp4 = new Employee();
        Employee emp5 = new Employee();


        emp1.comp_name = "Google";

        emp1.name = "kamal";
        emp1.id = 1;
        emp1.takeSalary(5000);

        emp2.name = "Aman";
        emp2.id = 2;
        emp2.takeSalary(1000);

        emp3.name = "sumit";
        emp3.id = 3;
        emp3.takeSalary(6000);

        emp4.name = "Monu";
        emp4.id = 4;
        emp4.takeSalary(7000);

        emp5.name = "sagar";
        emp5.id = 5;
        emp5.takeSalary(8000);


        System.out.println(emp1.comp_name+ " " + emp1.name + " " +emp1.id);
        emp1.printsalary();

        System.out.println(emp2.comp_name+ " " + emp2.name + " " +emp2.id);
        emp2.printsalary();

        System.out.println(emp3.comp_name+ " " + emp3.name + " " +emp3.id);
        emp3.printsalary();

        System.out.println(emp4.comp_name+ " " + emp4.name + " " +emp4.id);
        emp4.printsalary();

        System.out.println(emp5.comp_name+ " " + emp5.name + " " +emp5.id);
        emp5.printsalary();
        
    }
}

class Employee{
    public String name;
    static String comp_name;
    public int id;
    private int salary;
    public void printsalary(){
        System.out.println("salary of "+this.name+" is - "+ this.salary+"\n");
    }
    public void takeSalary(int s){
        this.salary = s;
    }
}