

import java.util.Scanner;

public class armstrong {
    public static int cube(int n){
        return n*n*n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number - ");
        int a = sc.nextInt();
        int t = a;
        int sum=0;
        while(a!=0){
            int r = a%10;
            int rcube = cube(r);
            sum = sum+rcube;
            a = a/10;
        }
        if(sum==t) System.out.println(t+" is an armstrong number");
        else System.out.println(t+" is not an armstrong number");
    }
}
