import com.sun.org.apache.xerces.internal.xs.ItemPSVI;

import java.util.Arrays;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-07-22
 * Time: 9:47
 */
public class Sort {
    // 归并排序---递归
//    public static  void mergeSort(int[] array) {
//
//    }
//
//// 归并排序---非递归
//    public static void mergeSort(int[] array){
//        // write code  here
//    }

// 计数排序
    public static void countSort(int[] array){
        // write code  here
    }

    /**
     * 直接插入排序
     * @param array
     * @param
     * @param
     */
    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key=array[i];
            int end = i-1;
            while (end >=0 && key < array[end]) {
                array[end +1] =array[end];
                end--;
            }
            array[end+1] = key;
        }
    }

    /**
     * 希尔排序
     * @param array
     * @param
     * @param
     */
    public static void shellSort(int[] array) {
        int gap = array.length-1;
        while (gap>1) {
            gap= gap/3+1;
            for (int i = gap; i < array.length; i++) {
                int end = i-gap;
                int key = array[i];
                while (end >=0 && array[end] >key) {
                    array[end+gap] = array[end];
                    end-=gap;
                }
                array[end+gap] =key;
            }
        }
    }
    public static void swap(int[] array,int a,int b) {
        int tmp=array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
    public static int holeSort(int[] array,int start,int end) {
        int key = array[start];
        while (end > start) {
            while (end > start && array[end] > key) {
                end--;
            }
            swap(array,start,end);
            while (end > start && array[start] < key) {
                start++;
            }
            swap(array,start,end);
        }
        array[start] = key;
        return start;
    }
    public static void selectSortOP(int[] array){
        int begin = 0;
        int end = array.length-1;
        while(begin < end){

            // 在[begin, end]区间中找最大和最小元素的位置
       // 最大元素的位置使用maxPos标记
            // 最小元素的位置使用minPos标记
        int minPos = begin;
            int maxPos = begin;
            int index = begin+1;
            while(index <= end){
                if(array[index] > array[maxPos]){
                    maxPos = index;
                }

                if(array[index] < array[minPos]){
                    minPos = index;
                }

                index++;
            }

            // 在[begin, end]区间中，已经找到了最小与最小元素的位置
       if(maxPos != end){
                swap(array, maxPos, end);
            }

            if(minPos == end){
                minPos = maxPos;
            }

            if(minPos != begin){
                swap(array, minPos, begin);
            }

            begin++;
            end--;
        }
    }
    //================================================================
// 堆排序
    public static void shiftDown(int[] array, int size, int parent){
        // child标记parent的左孩子---parent可能有左没有右
        int child = parent*2 + 1;
        while(child < size){   // 如果循环条件成立：parent的左孩子一定是成立的

            // 右孩子存在的情况下，找左右孩子中最大的孩子
            if(child+1 < size && array[child+1] > array[child]){
                child += 1;
            }

            // 检测parent是否满足堆的特性
            if(array[parent] < array[child]){
                swap(array, parent, child);
                parent = child;
                child = parent*2+1;
            }else{
                return;
            }
        }
    }

    // 时间复杂度：O(NlogN)
// 空间复杂度：O(1)
// 稳定性：不稳定
// 应用场景：需要一个序列中前k个最大||最小 ---- 可能会和其他排序复合起来提高排序的效率
    public static void heapSort(int[] array){
        // 1. 建堆
        // a. 找倒数第一个非叶子节点
        int size = array.length;
        int lastLeaf = ((size-2)>>>1);
        for(int root = lastLeaf; root >= 0; root--){
            shiftDown(array, size, root);
        }

        // 2. 利用堆删除的思想排序
        int end = size-1;
        while(end > 0){
            // 用堆顶元素与堆中最后一个元素交换
            swap(array, 0, end);

            // 将堆中有效元素个数减少一个

            // 将堆顶元素向下调整
            shiftDown(array, end,0); // logN

            end--;
        }
    }
    public static void insertSort2(int[] array,int start,int end) {
        for (int i = start+1; i <= end; i++) {
            int key=array[i];
            int j = i-1;
            while (j >= start && key < array[j]) {
                array[j +1] =array[j];
                j--;
            }
            array[j+1] = key;
        }
    }

    /**
     * hoare快排
     * @param
     * @param start
     * @param end
     * @return
     */
    public static int hoareSort(int[] array,int start,int end){
        int key = array[start];
        int cur = start;
        while (end > start) {
            while (end > start) {
                if(array[end] >= key) {
                    end--;
                } else {
                    break;
                }
            }
            while (start < end) {
                if(array[start] <= key) {
                    start++;
                } else {
                    break;
                }
            }
            swap(array,start,end);
        }
        swap(array,cur,start);
        return start;


    }
    private static int midNumIndex(int[] array,int left,int right){
        int mid = (left+right)>>>1;
        if(array[left] > array[right]) {
            if(array[mid] > array[left]){
                return left;
            } else if(array[mid] < array[right]) {
                return right;
            }
            return mid;
        }
        if(array[left] < array[right]) {
            if(array[mid] > array[right]){
                return right;
            } else if(array[mid] < array[left]) {
                return left;
            }
            return mid;
        }

        return -1;
    }
    public static void quickHoare(int[] array,int left,int right) {
        if(left>=right) {
            return;
        }
        if(right-left <=6) {
            insertSort2(array,left,right);
            return;
        }
        int index = midNumIndex(array,left,right);
        swap(array,left,index);
        int pivot = hoareSort(array,left,right);
        quickHoare(array,left,pivot-1);
        quickHoare(array,pivot+1,right);

    }
    public static void quickHole(int[] array,int left,int right) {
        if(left>=right) {
            return;
        }
        int pivot = hoareSort(array,left,right);

        quickHole(array,left,pivot-1);
        quickHole(array,pivot+1,right);

    }
    public static void Hoare(int[] array) {
        quickHoare(array,0,array.length-1);
    }
    public static void Hole(int[] array) {
        quickHole(array,0,array.length-1);
    }
    public static void testSortTime() {
        int[] array = new int[10_0000];
        Init init = new Init();
        init.initSortNoOrder(array);
        long startTime = System.currentTimeMillis();
        Hoare(array);
        long endTime = System.currentTimeMillis();
        System.out.println(Math.abs(startTime-endTime));
    }

    /**
     * 归并排序
     * @param
     */
    private static void mergeSortFunc(int[] array,int left,int right) {
        if (left >= right) {
            return;
        }
        int mid = (left+right) /2;
        mergeSortFunc(array,left,mid);
        mergeSortFunc(array,mid+1,right);
        merge(array,left,right,mid);
    }
    private static void merge(int[] array,int start,int end,int midIndex) {
        int[] tmpArray = new int[end-start+1];
        int k = 0;
        int s1 = start;
        int e1 = midIndex;
        int s2 = midIndex+1;
        int e2 = end;
        while (s1<=e1 && s2 <= e2) {
            if (array[s1] <= array[s2]) {
                tmpArray[k++] = array[s1++];
            } else {
                tmpArray[k++] = array[s2++];
            }
        }
        while (s1 <=e1) {
            tmpArray[k++] = array[s1++];
        }
        while (s2 <= e2) {
            tmpArray[k++] =array[s2++];
        }
        for (int i = 0; i < k; i++) {
            array[i+start] =tmpArray[i];
        }
    }
    //非递归归并排序
    public static void mergerSort(int[] array) {
        int gap = 1;
        while (gap < array.length) {
            for (int i = 0; i < array.length; i+=gap*2) {
                int s1 = i;
                int e1 = i+gap-1;
                if(e1 > array.length) {
                    e1 = array.length-1;
                }
                int s2 = e1+1;
                if(s2 > array.length) {
                    s2 = array.length-1;
                }
                int e2 = s2+gap-1;
                if(e2 > array.length) {
                    e2 = array.length-1;
                }
                merge(array,s1,e2,e1);
            }
            gap*=2;
        }
    }
    public static void main(String[] args) {
        int[] array={9,7,3,66,0,-4,5,6};
        //mergeSortFunc(array,0,array.length-1);
        mergerSort(array);
        System.out.println(Arrays.toString(array));
        //testSortTime();

        //Hole(array);
        //insertSort(array);
        //shellSort(array);

    }
}
