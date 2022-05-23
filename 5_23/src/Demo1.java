/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-23
 * Time: 11:44
 */
class Person implements Cloneable{
    int age;
    String name;

   // @Override
    /*public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }*/

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class Demo1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person=new Person();
        Person person1=(Person) person.clone();
        System.out.println(person);
        System.out.println(person1);

    }
}
