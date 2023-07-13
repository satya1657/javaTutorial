

public class greatestnum {
    public static void main(String[] args) {
        int arr[] = {4,34,65,34,43,5,6,67,7000,4,43,5,57,7,8,65,4,34,667,453};

        int res = -1000;

        for(int i= 0 ;i<arr.length;i++){
                if(res<arr[i]){
                    res = arr[i];
                }
        }

        System.out.println("greates number - "+res);
    }
}
