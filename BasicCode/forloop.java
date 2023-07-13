import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number - ");
        int i=sc.nextInt();
        System.out.println("table for  "+i);
        for(int j=1;j<=10;j++){
            System.out.println(i*j);
        }
    }
}
