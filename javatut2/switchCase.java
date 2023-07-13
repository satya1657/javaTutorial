import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter your class - ");
        int cl = sc.nextInt();

        switch(cl){
            case 1 : System.out.println("You in 1st class");
                    break;
            case 2 : System.out.println("You in 2nd class");
                    break; 
            case 3 : System.out.println("You in 3rd class");
                    break;
            case 4 : System.out.println("You in 4th class");
                     break;
            case 5 : System.out.println("You in 5th class");
                     break;
            default : System.out.println("You are not in our school");
        }
        
    }
}
