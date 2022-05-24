/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-24
 * Time: 22:35
 */

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
        return 0;
    }

}


public class Test {
    public static void main(String[] args) {

    }
}
