package LeetCode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-27
 * Time: 14:59
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int length= digits.length;
        for (int i = length-1; i >0; i--) {
            if(digits[i]!=9) {
                digits[i]+=1;
                return digits;
            }else {
                digits[i]=0;
            }
                    }
        int[]temp= new int[length+1];
        temp[0]=1;
        return temp;

    }
}
