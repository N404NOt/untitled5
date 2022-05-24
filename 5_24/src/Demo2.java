/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-24
 * Time: 20:16
 */
public class Demo2 {
    public static void main(String[] args) {
        String a="abcd";
        String b=new String("abcd");
        char[] ch={'a','b','c','d'};
        String c=new String(ch);
        String d="abcd";
        System.out.println(a==c);
        System.out.println(a==d);

    }
}
