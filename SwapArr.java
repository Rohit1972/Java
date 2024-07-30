import java.util.Arrays;

public class SwapArr {
    public static void main(String[] args) {
        int[] arr={1,3,23,9,18};
        // swap(arr,0,4);  when you only swap the element between index, then uncomment it.
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

static void reverse(int[] arr){
    int start=0;
    int end =arr.length-1;

    while (start<end) {
        swap(arr, start, end);
        start++;
        end--;
    }
}

    //Swap array
    static void swap(int[] arr, int index1, int index2){
        int temp =arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }
    
}
