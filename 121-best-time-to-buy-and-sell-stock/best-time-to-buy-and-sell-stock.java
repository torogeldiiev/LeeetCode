class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, current = Integer.MAX_VALUE;
        int answer = 0;
        for(int i = 0; i < prices.length;i++){
            if(prices[i] < current){
                current = prices[i];
            }

            profit = prices[i] - current;

            if(profit > answer){
                answer = profit;
            }
        }
        return answer;
    }
}