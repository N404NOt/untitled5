package LeetCode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-23
 * Time: 14:53
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int money=0;
        for (int i = 0; i < prices.length-1; i++) {
            if(prices[i]<prices[i+1]) {
                money+=prices[i+1]-prices[i];
            }
        }
        return money;
    }
    }