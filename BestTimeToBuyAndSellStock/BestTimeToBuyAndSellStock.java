/**
 * @author Kelvin Clovis Montoli de Souza
 *
 * LeetCode Question: 121. Best Time To Buy And Sell Stock
 * 
 * Problem Statement: You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 *
 * Solution Approach: Dynamic Sliding Window approach, iterate through the array, keeping track of the minimum price encountered and updating the maximum profit.
 */


package BestTimeToBuyAndSellStock;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int answer = 0;

        if (prices.length <= 0) {
            return answer;
        }

        for (int index = 1, minPrice = prices[0]; index < prices.length; index++) {
            if (minPrice > prices[index]) {
                minPrice = prices[index];
            }
            if (answer < (prices[index] - minPrice)) {
                answer = prices[index] - minPrice;
            }
        }
        return answer;
    }
}
