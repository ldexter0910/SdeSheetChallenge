// Problem Statement
// You are given an array/list 'prices' where the elements of the array represent the prices of the stock 
// as they were yesterday and indices of the array represent minutes.
// Your task is to find and return the maximum profit you can make by buying and selling the stock. 
// You can buy and sell the stock only once.
// Note:
// You can’t sell without buying first.

import java.util.ArrayList;

public class StockBuyAndSell {
    public static int maximumProfit(ArrayList<Integer> prices) {
        // Write your code here.
        int maxProfit = 0;
        int minStockPrice = prices.get(0);
        for (Integer price : prices) {
            if (price < minStockPrice) {
                minStockPrice = price;
            }
            maxProfit = Math.max(maxProfit, price - minStockPrice);
        }
        return maxProfit;
    }
}