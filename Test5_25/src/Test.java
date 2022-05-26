import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-25
 * Time: 7:04
 */
import java.util.*;
class Student {
    int age;
    String name;

    @Override
    public int hashCode() {
        //return super.hashCode();
        return Objects.hash(age);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==this) {
            return true;
        }
        if(obj instanceof Student||obj==null) {
            return false;
        }
        if(getClass()!=obj.getClass()) {
            return false;
        }
        Student tmp=(Student) obj;

        return this.name.equals(tmp.name);
       // return Objects.equals(name,tmp.name);
        //return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
public class Test {
    public static void main(String[] args) {
        Student[] students=new Student[3];
        students[0]=new Student(12,"aaa");
        students[1]=new Student(13,"bbb");
        students[2]=new Student(12,"aaa");
    }
}
