class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buy){
            buy=prices[i];
            }
            int currentprice=prices[i]-buy;
            if(currentprice>profit){
                profit= currentprice;
            }
        }
        return profit;

    }
}