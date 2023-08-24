package july;/*
        Find maximum profit earned by buying and selling shares any number of times
        Given a list containing future prediction of share prices,
        find the maximum profit earned by buying and selling shares any number of times with the constraint,
        a new transaction can only start after the previous transaction is complete,
        i.e., we can only hold at most one share at a time.
        For example:
        Stock Prices: {1, 5, 2, 3, 7, 6, 4, 5}

        Total profit earned is 10

        Buy on day 1 and sell on day 2
        Buy on day 3 and sell on day 5
        Buy on day 7 and sell on day 8


        Stock Prices: {10, 8, 6, 5, 4, 2}

        Total profit earned is 0
*/

public class CodeChallenge_2807 {

    public static void maxProfit(int[] prices)
    {
        int profit=0;
        int n= 0;
        for (int i=1; i<prices.length; i++)
        {
            if(prices[i-1]>prices[i]) {
                System.out.println(prices[i-1] + " "+prices[i] );
                n=i;
            }
            if (prices[i-1]<=prices[i] && (i+1==prices.length || prices[i]>prices[i+1]))
            {
                profit += (prices[i] - prices[n]);
                System.out.println("day "+(n+1)+" sell "+(i+1));
            }
        }
        System.out.println("Profit : "+ profit);
    }

    public static void main(String[] args) {
        int[] prices= {1, 5, 2, 3, 7, 6, 4, 5};
        maxProfit(prices);
    }
}
