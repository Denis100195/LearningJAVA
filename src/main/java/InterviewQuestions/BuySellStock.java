package InterviewQuestions;

public class BuySellStock {
    public int maxProfit(int[] prices) {

        int profit = 0;
        int min = 0;
        int max = 0;

        for (int i = 0; i < prices.length; i++){
            if (prices[i] < prices[i+1]){
                min = prices[i];

                for (int j = i + 1; j < prices.length; j++){

                    if (prices[j] > min){
                        max = prices[j];
                        profit += max - min;
                    }

                }
            }
        }


        return profit;
    }
}
