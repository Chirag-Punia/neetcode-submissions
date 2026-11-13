class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int i = 1;
        int diff = 0;
        int min = prices[0];
        while(i < n){
            diff = Math.max(prices[i] - min , diff);
            min = Math.min(prices[i] , min);
            i++;
        }
        return diff;
    }
}
