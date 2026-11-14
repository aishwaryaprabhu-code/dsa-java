class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int profit = prices[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
}


// One pass. Time: O(n) Space: O(1)
-----------------------------------------------------------------------------------------------
                     Start minPrice with   |  Then loop from
                      1.prices[0]          |    i = 0 or  i = 1 both work
                    2.Integer.MAX_VALUE    |     i = 0
