import java.util.Scanner;

public class matrix1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row");
        int row = sc.nextInt();
        System.out.println("enter columns");
        int col = sc.nextInt();
        int [][] mat = new int[row][col];

        System.out.println("enter elements of the matrix");

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
               mat[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
