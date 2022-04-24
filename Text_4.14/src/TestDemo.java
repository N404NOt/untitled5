import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-04-17
 * Time: 22:23
 */
 public class TestDemo {
    /**
     * Random的种子相同时产生的随机数相同,但是使用次数不同产生的随机数不同
     * @param args
     */
    public static void main(String[] args) {
        Random random=new Random();
        Random r2=new Random();
        char a=(char)(Math.random()+128);
        int num=random.nextInt();
        System.out.println(num);

      /*  int rannum=random.nextInt();
        System.out.println(rannum);
        int a=r2.nextInt();
        int b=r2.nextInt();
        System.out.println(a);
        System.out.println(b);*/
        /*boolean a=random.nextBoolean();
        System.out.println(a);
        float r=r2.nextFloat();
        System.out.println(r);*/
    }
    public static void main3(String[] args) {
        String str;
        while(true){
            Scanner scan=new Scanner(System.in);
            str=scan.nextLine();
            System.out.println(str);
        }

    }
    public static void main2(String[] args) {
        Scanner scan=new Scanner(System.in);
        int i=0;
        System.out.println("Please input your"+ i+" number:");
        int a=0;
        while(scan.hasNextInt()){
            System.out.println(a);
            System.out.println("Please input your"+ i+" number:");
            a=scan.nextInt();
            i++;
        }
    }
     public static void main1(String[] args){
         String str="abcdef";
         String arr="1234";
         int a=10000;
         System.out.println(Integer.parseInt(arr)+1);
         System.out.println(String.valueOf(a));
         System.out.println(Integer.MAX_VALUE);
         System.out.println(str.length());
         System.out.println(str.replace('e','a'));
         System.out.println(str.toUpperCase());

     }
}
