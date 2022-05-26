package LeetCode;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-26
 * Time: 12:29
 */
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int cur1=0;
        int cur2=0;
        int length1=nums1.length;
        int length2=nums2.length;
        int count1=0,count2=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> set=new HashSet<Integer>();
        List<Integer> list=new ArrayList<>();
        int i=0;
        while(count1<length1 && count2<length2) {
            if(nums1[count1]==nums2[count2]) {
                list.add(nums1[count1]);
                count1++;
                count2++;
                continue;
            } else if(nums1[count1]<nums2[count2]) {
                count1++;
                continue;
            }else {
                count2++;
            }
        }
        int[] temp=new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            temp[i]=list.get(i);
        }
        /*for (int n:list) {
            temp[i++]=list.get(i);
        }*/
       // return temp;
        //return Arrays.copyOfRange(temp,0,k);

    }
}
public class Intersection {

}
