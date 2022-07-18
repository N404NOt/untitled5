/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-07-18
 * Time: 23:08
 */
public class Sort {
    private static void swap(int[] array,int i,int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
    private static int partitionHoare(int[] array,int start,int end) {
        int i = start;//事先存储好start下标
        int key = array[start];
        while (start < end) {
            //为啥取等号？ 不然就死循环了
            while (start < end && array[end] >= key) {
                end--;
            }
            while (start < end && array[start] <= key) {
                start++;
            }
            swap(array,start,end);
        }
        swap(array,start,i);
        return start;
    }

    /**
     * 挖坑法
     * @param array
     * @param start
     * @param end
     * @return
     */
    private static int partitionHole(int[] array,int start,int end) {
        int key = array[start];
        while (start < end) {
            while (start < end && array[end] >= key) {
                end--;
            }
            array[start] = array[end];
            while (start < end && array[start] <= key) {
                start++;
            }
            array[end] = array[start];
        }
        array[start] = key;
        return start;
    }


    /**
     * 前后指针法
     * @param array
     * @param start
     * @param end
     * @return
     */
    private static int partition(int[] array,int start,int end) {
        int prev = start ;
        int cur = start+1;
        while (cur <= end) {
            if(array[cur] < array[start] && array[++prev] != array[cur]) {
                swap(array,cur,prev);
            }
            cur++;
        }
        swap(array,prev,start);
        return prev;
    }


    private static void quick(int[] array,int left,int right) {
        //这里代表 只要一个节点了 大于号：有可能没有子树
        if(left >= right) {
            return;
        }
        int pivot = partition(array,left,right);
        quick(array,left,pivot-1);
        quick(array,pivot+1,right);
    }

    /**
     * 时间复杂度：N*logN 【理想-》每次都是均分待排序序列】
     *          最慢：O(n^2) 数据有序或者逆序
     * 空间复杂度：
     * 稳定性：
     * @param array
     */
    public static void quickSort(int[] array) {
        quick(array,0,array.length-1);
    }
}
