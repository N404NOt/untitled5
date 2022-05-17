package Factoary;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-14
 * Time: 17:14
 */
public class Factory {
    String data1="轮子";
    String data2="发动机";
    void function() {
        System.out.println("汽车可以大喇叭");
    }
    static void function2() {
        System.out.println("下雨天挂雨刷器");
    }
    public Factory() {
        System.out.println("Factory的构造方法");
    }
    static {
        System.out.println("Factory的静态方法");
    }
    {
        System.out.println("Factory的实例方法");
    }
}
class Benz extends Factory {
    String name="奔驰";
    void function()
    {
        System.out.println("我是奔驰牌子的");
    }
    {
        System.out.println("下面是奔驰的实例方法");
        super.function();
        function();

    }
    public Benz() {

        super();
        System.out.println("Benz的构造方法");
    }

}
class Prosche extends Factory {
    String name="保时捷";
    void function()
    {
        System.out.println("我是保时捷牌子的");
    }
    {
        System.out.println("下面是保时捷的实例方法");
        super.function();
        function();

    }
    public Prosche() {

        super();
        System.out.println("Prosche的构造方法");
    }
}
