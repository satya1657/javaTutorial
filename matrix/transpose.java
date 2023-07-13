import java.util.Scanner;

public class transpose {

    public static void printMat(int[][] x){
            for(int i=0;i<x.length;i++){
                for(int j=0;j<x[0].length;j++)
                    System.out.print(x[i][j]+" ");
                System.out.println();    
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row - ");
        int r = sc.nextInt();
        System.out.println("Enter col - ");
        int c = sc.nextInt();

        int[][] A = new int[r][c];

        System.out.println("Enter elements - ");

        for(int i=0;i<r;i++){
            for (int j = 0; j < c; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("given matrix - ");
        printMat(A);
        System.out.println();
        // int[][] B = new int[c][r];

        // for(int i=0;i<r;i++){
        //     for (int j = 0; j < c; j++) {
        //         B[j][i] = A[i][j];
        //     }
        // }
        

        for(int i=0;i<r;i++){
            for (int j = 0; j < c; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        
        System.out.println("transpose matrix - ");
        printMat(A);


    }
}
