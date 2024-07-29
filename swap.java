public class swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        swap1(a,b);
        System.out.println(a+" "+b);
    }
    static void swap1(int a, int b){
        int temp=a;
        a=b;
        b=temp;

    }
}
