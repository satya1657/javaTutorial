public class maximumPathSum {

    static int t[][] = new int[3][3];
    public static long count = 0;
    public static void printMat(int[][] temp){
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[0].length; j++) {
                System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }

    }


    public static int maxPath(int i, int j, int [][] mat){
        System.out.println("i="+i+"  j="+j);
        count++;
        System.out.println("checking last element"); 
        if(j==mat[0].length-1 && i==mat.length-1){
            t[i][j] = mat[i][j];
            return t[i][j];
        }   
        System.out.println("checking column");     
        if(j==mat[0].length) return 0; //column
        System.out.println("checking row"); 
        if(i==mat.length) return 0; //row
        System.out.println("checking zero"); 
        if(t[i][j]!=0) return t[i][j];
        int R = maxPath(i, j+1, mat)+mat[i][j];
        int D = maxPath(i+1, j, mat)+mat[i][j];
        t[i][j]=Math.max(R, D);
        return t[i][j];
    }
    public static void main(String[] args) {
        int[][] mat = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("given matrix - ");
        printMat(mat);

        int result = maxPath(0,0,mat);
        System.out.println("anser - "+result);
        System.out.println("max path matrix - ");
        printMat(t);
        System.out.println("total call  - "+count);
    }
}
