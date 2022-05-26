import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-25
 * Time: 23:29
 */
public class TestDemo2 {
        class Solution {
            public boolean containsDuplicate(int[] nums) {
                Set<Integer> set = new HashSet<Integer>();
                for (int x : nums) {
                    if (!set.add(x)) {
                        return true;
                    }
                }
                return false;
            }
        }
