import java.util.Scanner;

class question6{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int pos = 0, neg = 0, zer =0;
        int n=0;
        while (!(n == 1000)) {
            System.out.println("enter num - ");
            n = sc.nextInt();
            if(n<0) neg++;
            else if (n>0) pos++;
            else zer++;
        }

        System.out.println("positive count - "+pos);
        System.out.println("negative count - "+neg);
        System.out.println("zero count - "+zer);
        
    }
}