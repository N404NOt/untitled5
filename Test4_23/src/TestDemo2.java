/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-04-23
 * Time: 15:24
 */
public class TestDemo2 {
    public static void main(String[] args) {
        for (int i = 0; i < ; i++) {
            
        }
    }
    public static void main2(String[] args) {
        int i=0;
        while(i<=100){
            if(i%3!=0||i%5!=0){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
    public static void main1(String[] args) {
        int sum1=0;
        int sum2=0;
        int sum=0;
        int i=1;
        while(i<=100){
            sum+=i;
            if(i%2==0){
                sum1+=i;
            }
            else{
                sum2+=i;
            }
            i++;

        }
        System.out.println("总和为:"+sum);
        System.out.println("奇数和为："+sum2);
        System.out.println("偶数数和为："+sum1);

    }
}
