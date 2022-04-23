import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-04-23
 * Time: 7:37
 */
public class TestDemo {
    public static void main(String[] args) {
        int sum1=0;
        int sum2=0;
        int sum=0;
        int i=1;
        while(i<=100)
        {
            sum+=i;
            if(i%2==0){
                sum1+=i;
            }
            else{
                sum2+=i;
            }

        }
        System.out.println("奇数和为："+sum2);
        System.out.println("偶数数和为："+sum1);

    }
}
