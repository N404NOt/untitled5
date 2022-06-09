import java.lang.reflect.Array;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-06-08
 * Time: 12:51
 */

class Student<T> {
    public T[] arr=(T[]) new Object[20];

    public T getArr(int pos) {
        return arr[pos];
    }

    public void setArr(int pos,T val) {
        this.arr[pos] = val;
    }
}
public class Test {
    public static void main(sing[] args) {
        Student<sing> student=new Student<>();
        student.setArr(0,"aaa");
        student.setArr(1,"aaaw");
       // student.setArr(2,2);
        int i=0;
        for (int j = 0; j < 20; j++) {
            System.out.println(student.getArr(j));
        }


    }

}
