

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-06-11
 * Time: 15:38
 */
public class Test {
    public static void main(String[] args) {
        String str1="abcd";
        String str2="cd";
        System.out.println(str1.indexOf(str2));
    }
    public static void main1(String[] args) {
        String next="abc/*-def2356g";
        String next2="eFg";
        String next3="12";
        int b=1234;
        String a=String.valueOf(b);
        String str4=next.replaceAll("[^a-z5-6]","");
        System.out.println(str4);
        int c=Integer.valueOf(next3);
        System.out.println(next.indexOf(next2));
        System.out.println(next.indexOf(next2));
        System.out.println(next.contains(next3));
        System.out.println(a);
        System.out.println(c);
    }

}
