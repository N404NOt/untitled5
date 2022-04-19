import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-04-19
 * Time: 22:23
 */
public class TestDemo {
    public static void main(String[] args) {
       // char b='高';
       // byte a=b;
        //long a=b;(
       // byte a=9;
       // byte b=(byte)(a+99999);
        //TODO:这里
       // int a=9;
//        boolean a=true;
//        System.out.println(a);
      //  System.out.println("a"+a);
        byte a=1;
        byte b=2;
        byte c=(byte)(a+b);
        //System.out.println(c);
        char d=97;
        //System.out.println(d+2);
        String ch="123456";
        System.out.println(ch.length());
        System.out.println(ch.toUpperCase());
        System.out.println(ch);
        System.out.println(ch.toLowerCase());
        System.out.println(ch.replace("e","hhhhh"));
        System.out.println(ch);
        System.out.println(Integer.parseInt(ch)+9999);
        int e=1111111;
        System.out.println(String.valueOf(e)+"hhhhh"+"aaaa");
    }
    public static void main1(String[] args) {
        System.out.println("最大值:"+Integer.MAX_VALUE);
        System.out.println("最小值"+Integer.MIN_VALUE);
        System.out.println("最大值"+Long.MAX_VALUE);
        int a=1;
        System.out.println(a);
        double b=3.266f;
        long c=16l;
        System.out.println(c);
        System.out.println(b);
    }
}
