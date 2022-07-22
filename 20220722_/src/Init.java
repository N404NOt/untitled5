import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-07-22
 * Time: 14:54
 */
public class Init {
    public void initSortNoOrder(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length ; i++) {
            array[i] = random.nextInt();
        }
    }
    public void initSortOrder(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }
}
