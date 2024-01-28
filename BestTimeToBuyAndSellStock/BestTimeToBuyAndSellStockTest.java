/**
 * @author Kelvin Clovis Montoli de Souza
 *
 * Unit tests for the BestTimeToBuyAndSellStock class.
 */

package LeetCode.BestTimeToBuyAndSellStock;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import java.util.Random;

public class BestTimeToBuyAndSellStockTest {

    @Test
    public void maxProfit_emptyInputArray_expectedAnswer() {
        // Test case for an empty input array
        int answer = 0, expectedAnswer = 0;
        int[] inputArray = {};
        answer = BestTimeToBuyAndSellStock.maxProfit(inputArray);
        assertEquals(answer, expectedAnswer);
    }

    @Test
    public void maxProfit_maximumProfitScenario_expectedAnswer() {
        // Test case the maximum profit scenario
        int answer = 0, expectedAnswer = 9;
        int[] inputArray = { 2, 1, 3, 4, 5, 6, 7, 8, 9, 10 };
        answer = BestTimeToBuyAndSellStock.maxProfit(inputArray);
        assertEquals(expectedAnswer, answer);
    }

    @Test
    public void maxProfit_noProfitScenario_expectedAnswer() {
        // Test case where's not possible to have any profit
        int answer = 0, expectedAnswer = 0;
        int[] inputArray = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        answer = BestTimeToBuyAndSellStock.maxProfit(inputArray);
        assertEquals(answer, expectedAnswer);
    }

    @Test
    public void maxProfit_randomInputValue_expectedAnswer() {
        // Test case with random input values
        Random random = new Random();
        int answer, expectedAnswer, randomLength = random.nextInt(100);

        int[] inputArray = new int[randomLength];
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = random.nextInt(100);
        }
        expectedAnswer = calculateMaxProfitFor(inputArray);
        answer = BestTimeToBuyAndSellStock.maxProfit(inputArray);
        assertEquals(expectedAnswer, answer);
    }

    private int calculateMaxProfitFor(int[] prices) {
        // Auxiliary function to properly calculate the expectedAnswer for random values
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
            }
        }
        return maxProfit;
    }
}
