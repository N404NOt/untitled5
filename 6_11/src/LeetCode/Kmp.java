package LeetCode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-06-11
 * Time: 16:23
 */

class Solution1 {
        public int strStr(String haystack, String needle) {
            int hatStrlen=haystack.length();
            int needStrlen=needle.length();
            if(needStrlen==0 || needStrlen>hatStrlen || needle==null) {
                return -1;
            }
            int i=0;
            int j=0;
            int[] next=new int[needStrlen];
            next[0]=-1;
            next[1]=0;
            int k=0;
            int nextLenth=needle.length();
            int o=2;
            while(o<nextLenth) {
                if(k==-1 || needle.charAt(o-1)==needle.charAt(k)) {
                    next[o]=k+1;
                    k+=1;
                    o++;
                }else {
                    k=next[k];
                }
            }
            while(i<hatStrlen && j<needStrlen) {
                if(j==-1 || haystack.charAt(i)==needle.charAt(j)) {
                    j++;
                    i++;
                } else {
                    j=next[j];
                }
            }
            if(j==needStrlen) {
                return i-j;
            }
            return -1;

        }
}
public class Kmp {
    public static void main(String[] args) {
        String str1="helaaelo";
        String str2="elo";
        Solution1 solution1=new Solution1();
        System.out.println(solution1.strStr(str1, str2));

    }
}
