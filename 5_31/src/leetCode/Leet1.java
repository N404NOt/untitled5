package leetCode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-06-01
 * Time: 0:27
 */

class Solution {
    public int firstUniqChar(String s) {
        int[] count=new int[26];
        char[] toChar=s.toCharArray();
        for(int i=0;i<s.length();i++) {
            count[toChar[i]-'a']++;
        }
        for(int i=0;i<s.length();i++) {
            if(count[toChar[i]-'a']==1) {
                return i;
            }
        }
        return -1;
    }
}
public class Leet1 {
}
