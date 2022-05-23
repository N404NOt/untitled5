package LeetCode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-23
 * Time: 17:20
 */
public class Solution2 {
    public int maxProfit(int[] prices) {
        int index=0;
        int size=prices.length;
        int sum=0;
        while(index<size) {
            while(index<size-1&&prices[index]<prices[index+1]) {
                index++;
            }
            int min=prices[index];
            while(index<size-1&&prices[index]>prices[index+1]) {
                index++;
            }
            sum+=prices[index]-min;
        }
        return sum;
    }
}
