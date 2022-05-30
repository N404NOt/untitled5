package leetCode;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-30
 * Time: 12:39
 */
class Solution1 {
    public void reverseString(char[] s) {
        StringBuilder sbd=new StringBuilder(String.valueOf(s));
        System.out.println(sbd);
        String reverS= String.valueOf(sbd.reverse());
        char[] temp=reverS.toCharArray();
        for (int i = 0; i < s.length; i++) {
            s[i]=temp[i];
        }
    }
}
/*class Solution1 {
    public void reverseString(char[] s) {
        int right=s.length-1;
        int left=0;
        char temp;
        while(left<right) {
            temp=s[left];
            s[left]=s[right];
            s[right]=temp;
        }

    }
}*/
public class Solution {
    public static void main(String[] args) {
        char[] s = {'a', 'b', 'd', 'r'};
        System.out.println(Arrays.toString(s));
        Solution1 so = new Solution1();
        so.reverseString(s);
        System.out.println(Arrays.toString(s));
    }
}
