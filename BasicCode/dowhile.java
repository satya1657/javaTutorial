public class dowhile {
   public static void main(String[] args) {
       int i=1;
       do{  int j=1;
            do{ 
                System.out.print(i);
                j++;
            }while(j<=i);
            System.out.println();
          i++;  
       }while(i<=6);
   } 
}
