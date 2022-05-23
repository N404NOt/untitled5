/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-24
 * Time: 0:04
 */
class Money implements Cloneable{
    public double m=19.9;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Student implements Cloneable {
    public int age;
    public Money m=new Money();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student tmp=(Student)super.clone();
        tmp.m=(Money)this.m.clone();
        return tmp;
    }
}
public class Demo1 {


    public static void main(String[] args) throws CloneNotSupportedException {
        Student student=new Student();
        Student student2= (Student) student.clone();
        System.out.println(student.m.m);
        System.out.println(student2.m.m);
        student.m.m=66.6;
        System.out.println(student.m.m);
        System.out.println(student2.m.m);
    }
}
