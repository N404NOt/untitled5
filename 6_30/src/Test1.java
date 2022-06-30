import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-06-30
 * Time: 7:18
 */
public class Test1 {
   /* public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list1 = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {
                    list1.add(1);
                } else {
                    list1.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
                }
            }
            list.add(list1);

        }
        return list;

    }*/
   public static void main(String[] args) {
       int[] nums1={1,2,3,0,0,0};
       int[] nums2={2,5,6};
       Solution solution=new Solution();
       solution.merge(nums1,3,nums2,3);


   }
}
class Solution1 {
    public void move(int[] nums,int size,int index) {
        for (int i = index; i < size-1; i++) {
            nums[i] = nums[i+1];
        }
    }
    public int removeElement(int[] nums, int val) {
        int size=nums.length;
        for (int i = 0; i < size; i++) {
            if(nums[i] == val) {
                move(nums,size,i);
                size--;
                i--;
            }
        }
        return size;
    }
}
class Solution2 {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> a = new ArrayList();
        // 将数组中的数字不重复的放进ArrayList
        // 第一个数字肯定不会重复
        a.add(nums[0]);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                a.add(nums[i]);
            }
        }
        // 根据ArrayList改变数组
        for(int i = 0; i < a.size(); i++){
            nums[i] = a.get(i);
        }
        return a.size();
    }
}
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums2.length ==0) {
            return ;
        }
        ArrayList<Integer> arrayList=new ArrayList<>();
        int n1=0;
        int n2=0;
        for (int i = 0; i < m+n; i++) {
            if(n1 == m) {
                for (int j = n2; j < n; j++) {
                    arrayList.add(nums2[j]);
                }
                break;
            }
            if(n2 == n) {
                for (int j = n1; j < m; j++) {
                    arrayList.add(nums1[j]);
                }
                break;
            }
            if(nums1[n1] <= nums2[n2]) {
                arrayList.add(nums1[n1++]);
            } else {
                arrayList.add(nums2[n2++]);
            }
        }
        for (int i = 0; i < m+n; i++) {
            nums1[i] = arrayList.get(i);
        }

    }
}

