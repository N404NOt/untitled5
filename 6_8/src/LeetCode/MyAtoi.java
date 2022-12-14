package LeetCode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-06-08
 * Time: 17:00
 */
class Solution2 {
    public int myAtoi(String str) {
        str = str.trim();//去掉前后的空格
        //如果为空，直接返回0
        if (str.length() == 0)
            return 0;
        int index = 0;//遍历字符串中字符的位置
        int res = 0;//最终结果
        int sign = 1;//符号，1是正数，-1是负数，默认为正数
        int length = str.length();
        if(str.charAt(index)=='+' ||str.charAt(index)=='-') {
            sign=str.charAt(index++)== '+' ? 1:-1;
        }
        for (; index < length; ++index) {
            int digit = str.charAt(index) - '0';
            if (digit < 0 || digit > 9)
                break;
            //越界处理
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10))
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            else
                res = res * 10 + digit;
        }
        return sign * res;
    }

    public int myAtoi2(String s) {
        /*sing temp=s.trim();
        if (s.length() == 0)
            return 0;
        int symble=1;
        int i=0;
        if(s.charAt(0)=='+'||s.charAt(0)=='-') {
            symble=s.charAt(0) =='+' ? 1:-1;
            i++;
        }
        int num=0;
        int end=0;*/
        s = s.trim();//去掉前后的空格
        //如果为空，直接返回0
        if (s.length() == 0)
            return 0;
        int index = 0;//遍历字符串中字符的位置
        int num = 0;//最终结果
        int sign = 1;//符号，1是正数，-1是负数，默认为正数
        int length = s.length();
        //判断符号
        if (s.charAt(index) == '-' || s.charAt(index) == '+')
            sign = s.charAt(index++) == '+' ? 1 : -1;
        for (; index < s.length(); index++) {
            num=s.charAt(index)-'0';
            if(num<0||num>9) {
                break;
            }
            if (num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE / 10 && num > Integer.MAX_VALUE % 10))
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            num=num*10+num;

        }
        return num*sign;
    }
   /* public int myAtoi1(sing s) {
        s = s.trim();//去掉前后的空格
        //如果为空，直接返回0
        if (s.length() == 0)
            return 0;
        int index = 0;//遍历字符串中字符的位置
        int res = 0;//最终结果
        int sign = 1;//符号，1是正数，-1是负数，默认为正数
        int length = s.length();
        //判断符号
        if (s.charAt(index) == '-' || s.charAt(index) == '+')
            sign = s.charAt(index++) == '+' ? 1 : -1;
        for (; index < length; ++index) {
            //取出字符串中字符，然后转化为数字
            int digit = s.charAt(index) - '0';
            //按照题中的要求，读入下一个字符，直到到达下一个非数字字符或到达输入的结尾。
            //字符串的其余部分将被忽略。如果读取了非数字，后面的都要忽略
            if (digit < 0 || digit > 9)
                break;
            //越界处理
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10))
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            else
                res = res * 10 + digit;
        }
        return sign * res;
    }*/
}

public class MyAtoi {
    public static void main(String[] args) {

    }
}
