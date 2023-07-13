class factorialrec{

    public static int recursive(int num){
        if(num ==1) return 1;
        return num*recursive(num-1);
    }
    public static void main(String[] args) {
        System.out.println("this is main function");
        int fact = recursive(5);
        System.out.println("factorial is -  "+fact);
    }
}