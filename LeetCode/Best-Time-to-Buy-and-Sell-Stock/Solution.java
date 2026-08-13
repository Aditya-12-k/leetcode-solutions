1import java.util.*;
2class Solution {
3    public int maxProfit(int[] prices) {
4        int buy = Integer.MAX_VALUE;
5        int maxProfit = 0;
6        for(int i=0; i<prices.length; i++){
7            if(buy<prices[i]){
8                int profit = (prices[i]-buy);
9                maxProfit = Math.max(profit,maxProfit);
10            }else{
11                buy = prices[i];
12            }
13        }
14        return maxProfit;
15    }
16}