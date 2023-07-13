import javax.lang.model.util.ElementScanner14;

public class boggle {

    public static Boolean boggleSearch(char[][] b,int i, int j, String s,int ind ){
        System.out.println("i - "+i+",  j - "+j+"  for - "+s.charAt(ind));
        if(i-1>=0 && b[i-1][j]==s.charAt(ind)){
            if(s.length()-1==ind) return true;
            return boggleSearch(b,i-1,j,s,ind+1); 
         }
        else if(i+1<b.length && b[i+1][j]==s.charAt(ind)){
            if(s.length()-1==ind) return true;
            return boggleSearch(b,i+1,j,s,ind+1); 
        } 
        else if(j+1<b[0].length && b[i][j+1]==s.charAt(ind)){
            if(s.length()-1==ind) return true;
            return boggleSearch(b,i,j+1,s,ind+1); 
        }
        else if(j-1>=0 && b[i][j-1]==s.charAt(ind)){
            if(s.length()-1==ind) return true;
            return boggleSearch(b,i,j-1,s,ind+1); 
        }else {
            System.out.println(s.charAt(ind)+" - not found");
            return false;            
        }
       }
    

    public static void main(String[] args) {
        char[][] B = new char[][]{{'A','L','O','A','B'},{'D','L','K','J','P'},
            {'H','E','M','C','M'},{'K','D','F','G','N'},{'H','X','Y','Z','W'}};

        String str = "XYFAMKJ";
        
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                if(str.charAt(0)==B[i][j]){
                    if(boggleSearch(B,i,j,str,1))
                       System.out.println("yes your string is present in Boggel");
                }
            }
        }
    }
}
