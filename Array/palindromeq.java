

public class palindromeq {
    public static void main(String[] args) {
        int flag = 0;
        int[] arr = new int[]{3,10,15,100,15,45,3};
        for(int i=0,j=arr.length-1;i<=j;i++,j--){
            if(arr[i]==arr[j]) continue;
            else{
                    flag = 1;
                    break;
            }
        }

        if(flag == 1) System.out.println("Not a palindrome");
        else System.out.println("yes palindrome");
    }
}
