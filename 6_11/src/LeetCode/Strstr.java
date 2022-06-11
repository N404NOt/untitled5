package LeetCode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-06-11
 * Time: 16:00
 */
class Solution {
    public int strStr(String haystack, String needle) {
        int hatStrlen=haystack.length();
        int needStrlen=needle.length();
        if(needStrlen==0 || needStrlen>hatStrlen || needle==null) {
            return -1;
        }
        int i=0;
        int j=0;
        while(i<hatStrlen&&j<needStrlen) {
            if(haystack.charAt(i)!=needle.charAt(j)) {
                i=i-j+1;
                j=0;
                continue;
            }else {
                i++;
                j++;
            }
        }
        if(j==needStrlen) {
            return i-j+1;
        }
        return -1;

    }
}
public class Strstr {
    public static void main(String[] args) {
        String str1="hello";
        String str2="ll";
        Solution solution=new Solution();
        System.out.println(solution.strStr(str1, str2));

    }
}
