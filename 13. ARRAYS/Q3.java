public class Q3 {
    public int MaxProfit(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buyPrice)
                buyPrice = prices[i];
            else {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit < 0 ? 0 : maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };

        Q3 ob = new Q3();
        int maxProfit = ob.MaxProfit(prices);

        System.out.println("Max Profit: " + maxProfit);
    }
}
