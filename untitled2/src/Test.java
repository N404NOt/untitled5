import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-25
 * Time: 23:33
 */
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int[] temp=nums;
        Arrays.sort(temp);
        for(int i=0;i<nums.length-1;i++) {
            if(temp[i]==temp[i+1]) {
                return false;
            }
        }
        return true;

    }
}
public class Test {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<Integer>();
        for (int n: nums) {

        }

    }
    }
