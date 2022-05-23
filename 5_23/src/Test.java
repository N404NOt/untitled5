import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-23
 * Time: 10:50
 */
class Student implements Comparable<Student>{
    public int age;
     String name;

    public Student(int age, String name) {
        this.age = age;
        this.name=name;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
class AgeComperator implements Comparator <Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return (int)(o1.age-o2.age);
    }
}
class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}
public class Test {

    public static void main(String[] args) {
        Student[] student=new Student[2];
        student[0]= new Student(12, "aaa");
        student[1]=new Student(1,"bbb");
        /*System.out.println(student[0].compareTo(student[1]));
        String name="asdf";*/
        System.out.println(Arrays.toString(student));
        AgeComperator ageComperator=new AgeComperator();
       // NameComparator nameComparator=new NameComparator();
        Arrays.sort(student,ageComperator);
        System.out.println(Arrays.toString(student));
        Arrays.sort(student,new NameComparator());
        System.out.println(Arrays.toString(student));



    }
}
