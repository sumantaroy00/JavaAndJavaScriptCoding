package JavaCoding.Array.ArrayLatest.BuyAndSellStock;

public class buyAndSellStockCoolDown {

    /*
     309. Best Time to Buy and Sell Stock with Cooldown
        
        You are given an array prices where prices[i] is the price of a given stock on the ith day.

        Find the maximum profit you can achieve. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times) with the following restrictions:

        After you sell your stock, you cannot buy stock on the next day (i.e., cooldown one day).
        Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).

        

        Example 1:

        Input: prices = [1,2,3,0,2]
        Output: 3
        Explanation: transactions = [buy, sell, cooldown, buy, sell]
        Example 2:

        Input: prices = [1]
        Output: 0
     */
    public static void main(String[] args) {

        int [] prices = {1,2,3,0,2};    
        int buy = -prices[0]; // You start with buying on the first day
        int sell = 0;        // No profit initially because we haven't sold anything
        int cd = 0;          // Cooldown also starts at 0
        
        for(int i =1 ; i<prices.length;i++){

            int nbuy = Math.max(buy,cd-prices[i]);  // Buy today or continue holding
            int nsell = Math.max(sell,buy+prices[i]);// Sell today
            int ncd = Math.max(cd,sell);// Enter cooldown (either rest or just sold)
            buy = nbuy;
            sell = nsell;
            cd =ncd;
        }
        System.out.println(sell);


        
    }
    
}
