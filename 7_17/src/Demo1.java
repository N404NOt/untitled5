/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-07-17
 * Time: 14:47
 */
public class Demo1 {
    //插入排序
    public static void insertSort (int[] arr) {
        int len=arr.length;
        for (int i = 1; i < len; i++) {
            int j=i-1;
            int tmp = arr[i];
            for (;  j >=0 ; j--) {
                if(arr[j] > tmp) {
                    arr[j+1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j+1] = tmp;
        }
    }
    // 希尔排序
    public static void shell(int[] arr,int gap) {
        int len=arr.length;
        for (int i = gap; i < len; i++) {
            int j=i-gap;
            int tmp=arr[i];
            for (; j >=0 ; j-=gap) {
                if(arr[j] > tmp) {
                    arr[j+gap] = arr[j];
                } else {
                    break;
                }
            }
            arr[j+gap] =tmp;
        }
    }
    public static void shellSort(int[] array,int[] arr){
        // write code  here
        int len = array.length;
        while (len > 1) {
            shell(arr,len);
            len/=2;
        }
        shell(arr,1);
    }
    // 选择排序
    public static void selectSort(int[] array){
        // write code  here
    }


}
