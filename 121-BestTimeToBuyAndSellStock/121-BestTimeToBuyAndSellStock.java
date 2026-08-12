// Last updated: 8/12/2026, 9:01:33 AM
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price : prices){
            if(price<minPrice){
                minPrice = price;
            }else if(price-minPrice>maxProfit){
                maxProfit = price-minPrice;
            }
        }return maxProfit;
    }
}