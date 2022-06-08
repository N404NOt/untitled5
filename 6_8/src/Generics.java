import java.lang.reflect.Array;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-06-08
 * Time: 13:07
 */
class Teacher<T> {
    public T[] array;

    public Teacher(Class<T>clazz,int capacity) {
        array= (T[])Array.newInstance(clazz,capacity);
    }

    public T getArray(int pos) {
        return array[pos];
    }

    public void setArray(T array,int pos) {
        this.array[pos] = array;
    }
}
class Mygenerics<T> {
    public T[] array;
    public  Mygenerics() {

    }
    public Mygenerics(Class<T>clazz,int capacity) {
        this.array=(T[]) Array.newInstance(clazz,capacity);
    }

    public T getArray(int pos) {
        return array[pos];
    }

    public void setArray(T array,int pos) {
        this.array[pos] = array;
    }
}
class Maxval {
    public static<T extends Comparable> T findMaxval(T[] array) {
        T max=array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i].compareTo(max)>0) {
                max=array[i];
            }
        }
        return max;


    }
}
class Common {
    public <T> void swap(T[] array,int i,int j) {
        T t=array[i];
        array[i]=array[j];
        array[j]=t;
    }
}
public class Generics {
    public static void main(String[] args) {
        Mygenerics<Integer> mygenerics=new Mygenerics<>(Integer.class,10);
        for (int i = 0; i < mygenerics.array.length; i++) {
            mygenerics.setArray(i,i);
        }
        Common common=new Common();

        common.swap(mygenerics.array,1,5);
        for (int i = 0; i < mygenerics.array.length; i++) {
            System.out.println(mygenerics.getArray(i));
        }
        System.out.println(Maxval.findMaxval(mygenerics.array));
    }
    public static void main1(String[] args) {
        Mygenerics<Integer> mygenerics=new Mygenerics<>(Integer.class,10);
        Teacher<Character> teacher=new Teacher<>(Character.class,10);
        for (int i = 0; i < mygenerics.array.length; i++) {
            mygenerics.setArray(i,i);
        }
        for (int i = 0; i < teacher.array.length; i++) {
            teacher.setArray((char) (i+'a'),i);
        }


    }
}
