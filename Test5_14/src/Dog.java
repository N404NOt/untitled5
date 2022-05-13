/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-14
 * Time: 0:47
 */
public class Dog {
    public String name;
    private int age;
    int heavy;
    public static int high;

    public void bark() {
        System.out.println(name + ' ' + "汪汪汪");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", heavy=" + heavy +
                '}';
    }
}
