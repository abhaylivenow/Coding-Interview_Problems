public class BestTimeToByAndSellStocks2 {

    public static void main(String[] args){
        int[] arr = {9,8,6,4,3,2,1}; // 0

        System.out.println(getProfit(arr));
    }
    
    public static int getProfit(int[] arr){
        int profit = 0;

        int n = arr.length;

        for(int i=1;i<n;i++){

            if(arr[i-1] < arr[i]){
                profit += arr[i] - arr[i-1];
            }

        }
        return profit;
    }
}
