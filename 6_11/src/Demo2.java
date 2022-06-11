/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-06-11
 * Time: 20:40
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0) {
            return "";
        }
        String str=strs[0];
        int i=1;
        while(i<strs.length) {
            while(strs[i].indexOf(str)!=0) {
                str=str.substring(0,str.length()-1);
            }
            i++;
        }
        return str;

    }
}
public class Demo2 {
}
