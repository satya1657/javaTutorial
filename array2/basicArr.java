

public class basicArr {
    public static void main(String[] args) {
        int []a = new int[50];
        System.out.println(a.length);
        
        for (int i = 1; i <= 100; i++) {
            if(i%2==0)
                a[i/2-1]=i;
        }

        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+ " " );
    }
}
