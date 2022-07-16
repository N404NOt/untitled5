/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-07-16
 * Time: 11:35
 */
public class Demo3 {
    public void insertSort(int[] array) {
        int size=array.length;
        for (int i = 1; i < array.length; i++) {
            int tmp=array[i];
            int j=i-1;
            for (; j >=0; j--) {
                if(array[j] > tmp) {
                    array[j+1] =array[j];
                } else {
                    break;
                }
                array[j+1] = tmp;
            }
        }
    }
}
