import java.util.*;

class ifelse{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("eneter a number - ");
      int a = sc.nextInt();
       
      if(a<0)
        System.out.println(a+" is negative number");
      else
        System.out.println(a+" is positive number");
      
    }
}