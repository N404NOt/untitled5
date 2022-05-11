import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-10
 * Time: 19:09
 */
public class Test1 {
    public static int[] arr() {
        int[] a={1,2};
        return a;
    }
    public static void main(String[] args) {
        int[]ar=arr();
        System.out.println(Arrays.toString(ar));
    }
}
