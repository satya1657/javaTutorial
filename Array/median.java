import java.util.Scanner;

public class median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array - ");
        int size = sc.nextInt();
        double []arr = new double[size];
        System.out.println("enter element of the array - ");

        for(int i=0;i<size;i++){
            arr[i]=sc.nextDouble();
        }
        double median;
        if(size%2==0){
            int index = size/2;
            median = (arr[index]+arr[index-1])/2;
        }else{
            int index = size/2;
            median = arr[index];
        }
        System.out.println("median is - "+median);
    }
}
