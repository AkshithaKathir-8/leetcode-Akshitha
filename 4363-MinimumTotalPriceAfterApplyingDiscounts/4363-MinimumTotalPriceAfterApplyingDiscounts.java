// Last updated: 8/12/2026, 8:43:02 AM
class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double t = 0.0;
        int p = prices.length-1;
        int d = discounts.length-1;
        while(p>=0&&d>=0){
            double dp=discounts[d];
            t+=prices[p]*(100.0-dp)/100.0;
            p--;
            d--;
        }
        while(p>=0){
            t+=prices[p];
            p--;
        }
        return t;
    }
}