public class seprate {
    public static void main(String[] args) {
        int []a = {1,2,-3,-4,5,-5,34,-323,78};
        int j=0,i=0;

        while(i<a.length){
            if(a[i]>0) i++;
            else{
                int t = a[i];
                a[i]=a[j];
                a[j]=t;

                i++;
                j++;
            }
        }
        System.out.println("array is - ");
        for(int k: a) System.out.print(k+" ");
    }
}
