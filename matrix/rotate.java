
import java.util.*;
public class rotate {

    public static void printMat(int[][] m){
        for(int i=0;i<m.length;i++){
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void rotatemat(int [][] m){
        int l = m.length;
         for(int i=0;i<l/2;i++){
            for(int j=i;j<l-i-1;j++){
                int temp = m[i][j];
                m[i][j] = m[l-j-1][i];
                m[l-j-1][i] = m[l-i-1][l-j-1];
                m[l-i-1][l-j-1] = m[j][l-i-1];
                m[j][l-i-1] = temp;
            }
         }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row - ");
        int l = sc.nextInt();

        int[][] a = new int[l][l];
        for(int i=0;i<l;i++){
            for (int j = 0; j < l; j++) {
                a[i][j] = (i+j+1)%10;
            }
        }
        printMat(a);
        System.out.println("Rotated Matrix is - \n");
        rotatemat(a);
        printMat(a);
    }
}
