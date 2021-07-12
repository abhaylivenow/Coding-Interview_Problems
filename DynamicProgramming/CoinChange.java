import java.util.*;

public class CoinChane {
    public static void main(String[] args){
        int[] coins = {1,2,5}; // O(n*m)
        int sum = 47;   // 5,5,5,5,2
        int[] dp = new int[sum + 1];

        Arrays.fill(dp,-1);

        System.out.println(getMinCoins(sum,coins,dp));
    }

    public static int getMinCoins(int sum, int[] coins,int[] dp){ 
        
        if(sum < 0) return -1;
        if(sum == 0) return 0;

        if(dp[sum] != -1) return dp[sum];

        int min =  Integer.MAX_VALUE;

        for(int coin : coins){

            int res = getMinCoins(sum - coin,coins,dp);

            if(res >= 0 && res < min){
                min = 1 + res;
            }

        }

        if(min == Integer.MAX_VALUE){
            dp[sum] = -1;
        }else {
            dp[sum] = min;
        }

        return dp[sum];

    }
}
