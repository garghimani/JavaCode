package javaquestions;

public class SellBuyStocks {

	public static int profit(int[] prices) {
		if (prices.length <= 0) {
			return 0;
		}
		int maxDiff = 0;
		int min = Integer.MAX_VALUE;
		for (int price : prices) {
			if (price < min) {
				min = price;
			} else {
				maxDiff = Math.max(price - min, maxDiff);
			}
		}
		return maxDiff;
	}

	public static void main(String[] args) {

		int[] prices = { 9, 2, 4, 10, 5, 1 };
		System.out.println("Maximum Profit : " + profit(prices));

	}

}
