import java.util.Arrays;

public class arrayfunction {
    public static void main(String[] args) {
        int[] nums={2,34,5,6};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void change(int[] arr){
        arr[0]=99; //arrays are mutable in java we can change it.
    }
    
}
