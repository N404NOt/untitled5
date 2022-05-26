package ArrayInversion;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-25
 * Time: 0:17
 */
class Solution1 {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int temp[] = new int[length];
        //把原数组值放到一个临时数组中，
        for (int i = 0; i < length; i++) {
            temp[i] = nums[i];
        }
        //把临时数组的值重新放到原数组，并且往右移动k位
        int walk=k%length;
        for (int i = 0; i < length; i++) {
            nums[(i + walk) % length] = temp[i];
        }

    }
}
public class ArrayInversion {

}
