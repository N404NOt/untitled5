package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-14
 * Time: 1:49
 */
public class TestOutInner {


    public static void main(String[] args) {
        //OuterClass outerClass=new OuterClass();
        OuterClass.InnerClass innerClass=new OuterClass.InnerClass();
        innerClass.sout1();
    }
}
