import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks - ");
        int n = sc.nextInt();
       switch(n){
        case 1 : System.out.println("You are in class - "+1);
                break;
        case 2: System.out.println("You are in class - "+2);
                break;
        case 3: System.out.println("You are in class - "+3);
                 break;
        case 4: System.out.println("You are in class - "+4);
                    break;
        case 5: System.out.println("You are in class - "+5);
                    break;
        default : System.out.println("You are not in our school");
       }

    }
}
