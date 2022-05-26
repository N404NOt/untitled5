package LeetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-26
 * Time: 11:18
 */
class Solution1 {
    public int singleNumber(int[] nums) {
        Set<Integer> set=new HashSet<Integer>();
        for(int num:nums) {
            if(!set.add(num)) {
                set.remove(num);
            }
        }
        return (int)set.toArray()[0];

    }
}
class Solution {
    public int singleNumber(int[] nums) {
        int target=0;
        for(int i=0;i<nums.length;i++) {
            target^=nums[i];
        }
        return target;

    }
}
public class OnleOnece {
}
