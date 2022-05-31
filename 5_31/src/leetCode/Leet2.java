package leetCode;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-06-01
 * Time: 0:48
 */
class Solution2 {
    public boolean isAnagram(String s, String t) {
        int sLength=s.length();
        int tLength=t.length();
        if(sLength!=tLength) return false;
        char[] sChar=s.toCharArray();
        char[] tChar=t.toCharArray();
        int[] recorderArr=new int[26];
        for(int i=0;i<sLength;i++) {
            recorderArr[sChar[i]-'a']++;
        }
        char temp;
        for(int i=0;i<tLength;i++) {
            temp=tChar[i];
            if(recorderArr[temp-'a']==0) {
                return false;
            }else {
                recorderArr[temp-'a']--;
            }
        }
        return true;

    }
}
class Solution1 {
    public boolean isAnagram(String s, String t) {
        char[] sChar=s.toCharArray();
        char[] tChar=t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        return Arrays.equals(sChar,tChar);

    }
}
public class Leet2 {
}
