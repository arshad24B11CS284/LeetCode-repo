class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int cost = prices[0] + prices[1];
        int dif = money - cost ;
        if(dif<0) return money;
        return dif;
    }
}