import java.util.Scanner;

public class countVowelFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give a line - ");
        String line = sc.nextLine();
        int f[] = new int[26];
        for(int j=0;j<line.length();j++){
                char ch = line.charAt(j);
                if(ch>=97 && ch <= 122)
                     f[ch-'a']++;
            }
        
            for(int i=0;i<26;i++){
                System.out.println( (char)(i+97) + "  - "+f[i]);
            }
           
        
     
    }
}
