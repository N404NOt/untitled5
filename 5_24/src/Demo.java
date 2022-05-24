/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-24
 * Time: 20:39
 */
class Name implements Cloneable{
    String name="abcd";

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Name{" +
                "name='" + name + '\'' +
                '}';
    }
}
class Peoper implements Cloneable{
    int age=6;
    Name n=new Name();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();
        Peoper tmp = new Peoper();
        tmp=(Peoper)super.clone();
        tmp.n=(Name)this.n.clone();
        return tmp;
    }

    @Override
    public String toString() {
        return "Peoper{" +
                "age=" + age +
                ", n=" + n +
                '}';
    }
}
public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Peoper peoper=new Peoper();
        Peoper peoper1=(Peoper)peoper.clone();
        peoper.age=99;
        peoper.n.name="aaaaaaa";
        System.out.println(peoper);
        System.out.println(peoper1);

    }
}
