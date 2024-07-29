public class swap {
    public static void main(String[] args) {
        int[] num={10,20};

        swap1(num);
        System.out.println(num[0]+" "+num[1]);
    }
    static void swap1(int[] arr){
        int temp=arr[0];
        arr[0]=arr[1];
        arr[1]=temp;

    }
}
