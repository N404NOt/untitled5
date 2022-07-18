import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-07-18
 * Time: 21:43
 */
public class DirectSort {
    public void directSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int end = i-1;
            while (end >=0) {
                if(array[end] > key) {
                    array[end+1] =array[end];
                    end--;
                } else {
                    break;
                }
            }
            array[end+1] = key;
        }
    }
    public static void main(String[] args) {
        int[] array = { 27,15,19,18,28,34,65,49,25,37 };
        //System.out.println(Arrays.toString(array));
        DirectSort dire = new DirectSort();
        dire.directSort(array);
        System.out.println(Arrays.toString(array));
    }
}
