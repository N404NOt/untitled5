import java.util.Arrays;
import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-20
 * Time: 10:09
 */
class Person{
    public String id;

    public Person(String id) {
        this.id = id;
    }
}
public class Main {


    public static void main(String[] args) {
        Person person=new Person("123");
        Person person1=new Person("123");
       // Objects objects=new Objects();
        System.out.println(Objects.equals(person.id,person1.id));
        System.out.println(person.equals(person1));
        /*String arr="123哈哈，。";
        String arr1="123哈哈，。";
        System.out.println(arr.equals(arr1));*/
       /* int size=arr.length();
        char[] ch=arr.toCharArray();
                //System.out.println();
        System.out.println(ch);
        System.out.println(arr);

        System.out.println(ch.toString());*/
        /*for (int i = 0; i < size; i++) {
            System.out.println(ch.toString());
        }*/
    }
}
