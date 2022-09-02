/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-09-02
 * Time: 17:35
 */
public class Test {
    public static void main(String[] args) {
        int a =0x08000;
        a=a >>>10;
        String s = Integer.toBinaryString(a);
        System.out.println(s);
    }
}
