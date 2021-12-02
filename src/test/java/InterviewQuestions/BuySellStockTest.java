package InterviewQuestions;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuySellStockTest {

    int[] prices = {7,1,5,3,6,4};
    BuySellStock buySellStock = new BuySellStock();

    @Test
    public void maxProfit() {
        int res = buySellStock.maxProfit(prices);
        Assert.assertEquals(res, 7);
    }
}