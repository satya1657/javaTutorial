class rowCol{
   public int row;
   private int col;

   rowCol(int r,int c){
       this.row=r;
       this.col=c;
   }
   public int getCol(){
    return this.col;
   }
}

public class zeroMat {
    public static void printmat(int[][] a){
        for (int i = 0; i < a.length; i++) { 
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][] a = new int[][]{{8,1,2,3,4,5},
                                 {1,4,9,6,7,8},
                                 {8,2,4,6,0,7},
                                 {3,5,7,5,6,8},
                                 {2,5,3,2,3,7},
                                 {3,0,2,4,6,5}};
        
        int count=0;
        printmat(a);

        for (int i = 0; i < a.length; i++) { // count the zeros
            for (int j = 0; j < a[0].length; j++) {
                if(a[i][j]==0)
                 count++;
            }
        }

        rowCol[] ar = new rowCol[count];

        int ind = 0;

        for (int i = 0; i < a.length; i++) { //fill array
            for (int j = 0; j < a[0].length; j++) {
                if(a[i][j]==0){
                    ar[ind] = new rowCol(i,j);
                    ind++;
                }
            }
        }

        for (int i = 0; i < ar.length; i++) {
            for(int j = 0;j<a[0].length;j++){
                a[ar[i].row][j]=0;
            }
            for(int k=0;k<a.length;k++){
                a[k][ar[i].getCol()]=0;
            }
        }
        System.out.println("after converting to zeros - ");

        printmat(a);



    }
}
