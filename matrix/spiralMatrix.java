public class spiralMatrix {
    public static void main(String[] args) {
        int [][] a = new int[][]{{8,1,2,3,4,5},
                                 {1,4,9,6,7,8}
                                 };

        int UL=0,BL=0,UR=a[0].length-1,BR=a.length-1;
        int r=0;
        while(UL<=UR && BL<=BR){
            for (int i = r; i <= UR; i++)
               System.out.print(a[r][i]+" ");
            for (int i=r+1;i<=BR;i++)
               System.out.print(a[i][UR]+" ");
            if(BL+1<=BR){   
            for (int i = UR-1; i >=BL; i--)
               System.out.print(a[BR][i]+" ");
            }   
            if(UL+1<=UR){
            for (int i = BR-1; i > UL; i--) 
               System.out.print(a[i][BL]+" ");
            }
            UL++;UR--;BL++;BR--;r++;       
        }                         

        // for (int i = 0; i <= a.length/2; i++) {
        //     for(int j=i;j<a[0].length-i;j++)
        //         System.out.print(a[i][j]+" ");
        //         System.out.print("new - ");
        //     for(int d=i+1;d<a.length-i;d++)
        //         System.out.print(a[d][a[0].length-i-1]+" ");
        //         System.out.print("new - ");
        //     for(int l=a[0].length-i-2;l>=0+i;l--)
        //         System.out.print(a[a.length-i-1][l]+" ");
        //         System.out.print("new - ");
        //     for(int u=a.length-i-2;u>i;u--)
        //         System.out.print(a[u][i]+" "); 
        //         System.out.print("new - ");           
        // }
    }
}
