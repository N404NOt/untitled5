/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-08
 * Time: 10:18
 */
class PetDog {
    public String name;
   // this.name="adas";
    public int age;
    public String color;
    public PetDog() {
        this.name="dahuang";
        this.age=99;
        this.color="huang";
        System.out.println("haihaiahi");
    }
    public void barks() {
        System.out.println(name+"wangwang");
    }
    public void age() {
        System.out.println(name+color+age);
    }
}
public class Test1 {
    public static void main(String[] args) {
        PetDog peidog=new PetDog();
        /*peidog.name="大黄";
        peidog.age=33;
        peidog.color="huangse";*/
        peidog.barks();
    }
}
