import javax.swing.plaf.ComboBoxUI;
public class zeromatrix {

    public static void printmat(int [][] m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [][] a = new int[][]{{8,1,2,3,4,5},{1,4,9,6,7,8},{0,2,4,6,0,7},{3,5,7,5,6,8},{2,5,3,2,3,7},{3,0,2,4,6,5}};

        int count=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if(a[i][j]==0) count++;
            }
        }
        
        System.out.println("originnal matrix - ");
        printmat(a);

        int [][] mat = new int[count][2];

        int index=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                  if(a[i][j]==0){
                     mat[index][0]=i;
                     mat[index][1]=j;
                     index++;
                  }
            }
        }

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[mat[i][0]][j]=0;
            }
            for (int k = 0; k < a.length; k++) {
                a[k][mat[i][1]]=0;
            }
        }
        
        System.out.println("after making row and col zero - ");
        printmat(a);

    }
}
