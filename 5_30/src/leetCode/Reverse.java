package leetCode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-30
 * Time: 13:26
 */
class Solution2{
    public int reverse(int x) {
        int temp=0;
        int note=x/Math.abs(x);
        x=x*note;
        int result=0;
        int num=0;
        while(x>0) {
            if(result>Integer.MAX_VALUE)
            num=x%10;
            result=result*10+num;
            x=x/10;
        }
        return result*note;

    }
}
public class Reverse {
}
