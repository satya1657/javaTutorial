import java.util.*;


public class function {

    public static int addition(int num1,int num2){
        int result = num1+num2;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num 1 - ");
        int n1 = sc.nextInt();
        System.out.println("enter num 2 - ");
        int n2 = sc.nextInt();
        int add = addition(n1, n2);
        System.out.println("sum of "+n1+" and "+n2+" is "+add); 
        sc.close();
    }
}