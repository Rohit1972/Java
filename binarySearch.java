public class binarySearch {

    public static void main(String[] args) {
        //applicable on sorted array
        int[] arr ={-21,-12,23,43,55,76};
        int target=-21;
        int ans=binSearch(arr, target);
        System.out.println(ans);
    }
        static int binSearch(int[] arr,int target){
            int start=0;
            int end=arr.length - 1 ;

            while (start<=end) {
                //find middle element
                // int mid=(start+end)/2;
                //might be possible that the (start +end) exceed the range of integer
                int mid=start+(end-start)/2;

                if (target<arr[mid]) {
                    end=mid-1;
                }else if(target>arr[mid]){
                    start=mid+1;
                }else{
                    //ans found
                    return mid;
                }
            }
            return -1;
        }
    }
