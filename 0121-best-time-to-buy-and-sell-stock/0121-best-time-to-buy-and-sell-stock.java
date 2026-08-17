class Solution {
    public int maxProfit(int[] prices) {
        int minpri=prices[0];
        int maxprice=0;
        for(int i= 1;i<prices.length;i++){
            minpri=Math.min(minpri,prices[i]);
            maxprice=Math.max(maxprice,prices[i]-minpri);
        }
        return maxprice;
    }
}