import java.util.Scanner;

import javax.print.attribute.standard.Sides;

public class maxmin {
    public static void main(String[] args) {
        System.out.println("Enter size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];

        for(int i=0;i<size;i++){
            System.out.println("enter input for index - "+i);
            a[i]=sc.nextInt();
}
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");    
    }
}
