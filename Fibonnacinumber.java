
public class Fibonnacinumber {
    static int solve(int n,int[] arr){
        if(n == 0 ){
          return 0;
        }
        if(n == 1){
            return 1;
        }
        if(arr[n] != -1){
            return arr[n];
        }
        return arr[n]=solve(n-1,arr)+solve(n-2,arr);
    }
    static int solvetab(int n){
        int[] arr=new int[n+1];
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i<=n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        for(int i=0;i<n+1;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
        return arr[n];
    }
    public static void main(String[] args) {
        // int n=5;
        // int[] arr=new int[n+1];
        // for(int i=0;i<6;i++){
        //     arr[i]=-1;
        // }
        // // int ans=solve(n,arr);
        // int ans=solvetab(n);


        // System.out.println(ans);
        // Scanner in =new Scanner(System.in);
        // int n=in.nextInt();
        int n=5;
        int a=0;
        int b=1;
        int count =2;
        while (count<=n) {
            int temp=b;    
            b=b+a;          
            a=temp;         
            count++;      
        }
        System.out.println("The Output is " + b);
       

    }
}