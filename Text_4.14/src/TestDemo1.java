import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-04-24
 * Time: 13:40
 */
public class TestDemo1 {
    public static void main(String[] args) {

                //跳出指定循环示例
                Loop1:for (int x=0; x<3 ; x++ )
                {
                    Loop2:for (int y=0; y<4 ; y++ )
                    {
                        System.out.println("x="+x);
                        break Loop2;
                    }
                }
            }
    public static void main3(String[] args) {
        int a=1;
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNextInt()){
            a=scanner.nextInt();
            System.out.println(a);
        }
    }
    public static void main2(String[] args) {
        String str1="hhhhh";
        String str2="hhhhh";
       boolean a= str1.equals(str2);
        System.out.println(a);
    }
    public static void main1(String[] args) {
        int a=2;
        int b=(int)Math.pow(3,3);
        System.out.println(b);
    }
}
