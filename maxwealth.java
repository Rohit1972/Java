public class maxwealth {
    public static void main(String[] args) {
        
    }
    public int maximumWealth(int[][] accounts){
         //person=row
         //account==col
        int ans=Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            //When you start a new col,take a new sum for that row
            int sum=0;
            for (int anInt :ints) {
                sum+=anInt;

            }
            //Now we have sum of accounts of person
            //Check with overall answer
            if (sum>ans) {
                ans=sum;
            }

            
        }
        return ans;
    }
}
