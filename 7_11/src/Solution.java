public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 
     * @param str string字符串 待判断的字符串
     * @return bool布尔型
     */
    public boolean judge (String str) {
        // write code here
        String val = new StringBuffer(str).toString();
        return val.equals(str);
    }
    public int sqrt (int x) {
        // write code here
        int left = 1;
        int right =x;
        int mid=(left+right)/2;
        while(mid<=x) {
            if(mid*mid==x || ((mid+1)*(mid+1)>x && mid*mid<x)) {
                return mid;
            }else if (mid * mid >x) {
                right=mid-1;
            } else {
                left=mid+1;
            }
        }
        return -1;
    }
}