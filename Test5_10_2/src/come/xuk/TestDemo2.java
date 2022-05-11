package come.xuk;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-11
 * Time: 0:42
 */
class washer {
    //这些是字段/成员变量
    String name;
    int power;
    String fuction;
    //这里是功能的实现/方法
    public void washcloth() {
        System.out.println("开始自己洗衣服啦");
    }
    public void wring() {
        System.out.println("开始拧干衣服啦");
    }
    public void introduction() {
        System.out.println("这台洗衣机的名字是："+name+"  "+"功率是"+power+"  "+"功能有"+fuction);
    }
}
public class TestDemo2 {
    public static void main(String[] args) {
        washer wash=new washer();
        wash.name="海尔洗衣机";
        wash.power=120;
        wash.fuction="洗衣功能与风干功能";
        wash.washcloth();
        wash.wring();
        wash.introduction();

    }
}
