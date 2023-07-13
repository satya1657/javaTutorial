public class arrayPassing {
    public static void addTwo(int[] b){
       for (int i = 0; i < b.length; i++) {
        b[i]=b[i]+2;
       }
    }
    public static int add(int a){
        a+=10;
        return a;
    }
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6};
        addTwo(a);
        for(int x : a)
          System.out.print(x+" ");

        System.out.println();
        int x =10;
        x=add(x);
        System.out.println(x);  
    }
}
