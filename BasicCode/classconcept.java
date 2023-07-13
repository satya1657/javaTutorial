import java.util.Scanner;

class student{
    public String name;
    private  int age;
    public String address;
    student(String n,int a, String add){
        this.name=n;
        this.age=a;
        this.address=add;
    }
    public int getAge(){
        return this.age;
    }
}


public class classconcept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        student[] stu_arr = new student[5];

        for(int i=0;i<5;i++){
            System.out.println("please enter the details for student - "+i);
            String n = sc.next();
            int a = sc.nextInt();
            String add = sc.nextLine();
            stu_arr[i] = new student(n, a, add);
        }

        for (int i = 0; i < stu_arr.length; i++) {
            System.out.println("name - "+stu_arr[i].name+" "+stu_arr[i].getAge()+" "+stu_arr[i].address);
        }
    }
}
