import java.util.Scanner;

public class anagram {

   // public static void printArray(int[] x){
      //  for (int i = 0; i < x.length; i++) {
   //         System.out.print(x[i]+" ");
    //    }
    //}

    public static boolean isEmpty(int[] a){
       // System.out.println("after ++ --");
        for (int i = 0; i < a.length; i++) {
            if(a[i]!=0) return false;
        }
       // printArray(a);
        return true;
    }

    public static boolean isAnagram(String str1, String str2){
            if(str1.length()!=str2.length()) return false;

            int []arr = new int [26];

            for(int i=0;i<str1.length();i++){
                char ch = str1.charAt(i);
                arr[ch-'a']++;
            }
         //   System.out.println("after ++");
         //   printArray(arr);
            for (int j=0 ; j< str2.length();j++) {
                char ch = str2.charAt(j);
                arr[ch-'a']--;
            }
         //   System.out.println("after --");
           // printArray(arr);
            boolean status = isEmpty(arr);
            return status;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first string");
        String s1 = sc.next();
        System.out.println("enter second string");
        String s2 = sc.next();
        boolean flag = isAnagram(s1, s2);
        if(flag) System.out.println("anagram");
        else System.out.println("not anagram");


    }
}
