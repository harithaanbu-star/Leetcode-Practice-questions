class Solution {
    public int maxProfit(int[] prices) {
        int buy1=Integer.MIN_VALUE;
        int sel1=0;
        int buy2=Integer.MIN_VALUE;
        int sel2=0;
        for(int pri:prices){
            buy1=Math.max(buy1,-pri);
            sel1=Math.max(sel1,buy1+pri);
            buy2=Math.max(buy2,sel1-pri);
            sel2=Math.max(sel2,buy2+pri);

        }
        return sel2;
    }   
    
}