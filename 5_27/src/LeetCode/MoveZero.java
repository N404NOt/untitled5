package LeetCode;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-27
 * Time: 15:34
 */
public class MoveZero {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0)
            return;
        int cur = 0;
        //一次遍历，把非零的都往前挪
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                nums[cur++] = nums[i];
        }
        //后面的都是0,
        while (cur < nums.length) {
            nums[cur++] = 0;
        }
    }

    public void moveZeroes1(int[] nums) {
        int length=nums.length;
        Arrays.sort(nums);
        int count=0;
        for (int i = 0; i < length; i++) {
            if(nums[i]==0) {
                count++;
            }
            if(count!=0) {
                break;
            }
        }
        int[] temp=nums;
        for (int i = 0; i < length; i++) {
                if(i<length-count) {
                    temp[i]=nums[i+count];
                }else {
                    temp[i]=0;
                }
        }
        nums=temp;

    }
}
