public class MaxProfit {
    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };

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

        System.out.println("Max Profit: " + maxProfit);
    }
}

// Output: Max Profit: 5