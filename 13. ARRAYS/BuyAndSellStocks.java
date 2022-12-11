public class BuyAndSellStocks {
    public int buyAndSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 3, 5, 3, 1, 6, 4 };

        BuyAndSellStocks ob = new BuyAndSellStocks();
        int maxProfit = ob.buyAndSellStocks(prices);

        System.out.println("Max Profit = " + maxProfit);
    }
}
