class Solution {
    public int maxProfit(int[] prices) {
        int minValue=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int price:prices)
        {
            if(price < minValue)
            {
                minValue=price;
            }
            else
            {
                int profit=price-minValue;
                if(profit>=maxProfit)
                {
                    maxProfit=profit;
                }
                // maxProfit=Math.max(maxProfit,price-minValue); this line can be written instead of the whole else part
            }
        }
        return maxProfit;
    }
}
