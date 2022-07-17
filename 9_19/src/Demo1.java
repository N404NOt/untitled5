/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-07-17
 * Time: 9:20
 */
public class Demo1 {
    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            int flag = array[i];
            for (int j = i+1; j < array.length-1; j++) {
                if(flag > array[j]) {
                    int tmp = array[i];
                    array[i] = array[flag];
                    array[flag] = tmp;
                    break;
                }
            }
        }

    }
}
