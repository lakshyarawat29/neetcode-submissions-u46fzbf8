class Solution {
    public int maxProfit(int[] prices) {
        int maxdiff = 0;
        int ba = prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i] < ba){
                ba = prices[i];
            }else{
                maxdiff = Integer.max(maxdiff,prices[i]-ba);
            }
        }

        return maxdiff;
    }
}
