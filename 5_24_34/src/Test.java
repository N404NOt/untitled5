import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-24
 * Time: 23:09
 */
class AgeComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.age-o2.age;
    }
}
class Student implements Comparable<Student>{
    int score;
    int age;
    String name;

    public Student(int score, int age, String name) {
        this.score = score;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.age-o.age;
    }

}
public class Test {
    public static void main(String[] args) {
        Student[] student=new Student[3];
        student[0]= new Student(12, 56,"asd");
        student[1]=new Student(56,23,"awww");
        student[2]=new Student(11,999,"asddddd");

       // System.out.println(student.compareTo(student1));
        AgeComparator ageComparator=new AgeComparator();
        Arrays.sort(student,ageComparator);
        System.out.println(Arrays.toString(student));
    }
}
