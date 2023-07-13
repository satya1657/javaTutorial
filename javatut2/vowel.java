import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character ");
        char ch = sc.next().charAt(0);
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'O':
            case 'E':
            case 'I':
            case 'U':  System.out.println("It is a vowel");
                       break;
            default: System.out.println("It is a Consonant");
        }
    }
}
