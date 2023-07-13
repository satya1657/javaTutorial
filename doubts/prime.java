
import java.util.Scanner;

public class prime {

    public static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true; 
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number - ");
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        while(n!=0){
            int r = n%10;
            sum = sum+r;
            n=n/10;
        }
        System.out.println("disgit sum for "+temp+" "+sum);
       
        }
}
