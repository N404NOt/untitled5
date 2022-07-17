import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.Arrays;

/**
 * @Author 12629
 * @Description：
 */
public class TestHeap {

    public int[] elem;
    public int usedSize;//当前堆当中的有效的元素的数据个数

    public TestHeap() {
        this.elem = new int[10];
        this.usedSize = 0;
    }

    public void initArray(int[] array) {
        elem = Arrays.copyOf(array,array.length);
        usedSize = elem.length;
    }

    /**
     * 建堆:【大根堆】
     * 时间复杂度：O(n)
     */

    public void createHeap(int[] arr) {
        initArray(arr);
        for (int parent = (usedSize-1-1) / 2; parent >= 0 ; parent--) {
            shiftDown(parent,usedSize);
        }
    }

    /**
     * 实现 向下调整
     * @param parent 每棵子树的根节点的下标
     * @param len 每棵子树的结束位置
     */

    private void shiftDown(int parent ,int len) {
        int child = 2 * parent + 1;
        //最起码是有左孩子
        while (child < len) {
            //判断 左孩子 和 右孩子  谁最大,前提是  必须有  右孩子
            if(child+1 < len && elem[child] < elem[child+1]) {
                child++;//此时 保存了最大值的下标
            }
            if(elem[child] > elem[parent]) {
                swap(elem,child,parent);
                parent = child;
                child = 2*parent+1;
            }else {
                break;
            }
        }
    }

    private void shiftUp(int child) {
        int parent = (child-1) / 2;
        while (child > 0) {
            if(elem[child] > elem[parent]) {
                swap(elem,child,parent);
                child = parent;
                parent = (child-1) / 2;
            }else {
                break;
            }
        }
    }
    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    /**
     * 入队
     * @param x
     */
    public void offer(int x) {
        if(isFull()) {
            elem = Arrays.copyOf(elem,elem.length*2);
        }
        this.elem[usedSize] = x;
        usedSize++;
        shiftUp(usedSize-1);
    }


    public boolean isFull() {
        return usedSize == elem.length;
    }

    /**
     * 出队
     */
    public int poll() {
        if(isEmpty()) {
            return -1;
        }
        int old = elem[0];
        swap(elem,0,usedSize-1);
        usedSize--;
        shiftDown(0,usedSize);
        return old;
    }

    public boolean isEmpty() {
        return usedSize == 0;
    }
    public void heapSort(int[] arr) {
        createHeap(arr);
        int root = 0;
        int len = arr.length-1;
        while (len >0) {
            swap(this.elem,0,len);
            shiftDown(0,len);
            len--;
        }

    }
    public void bubbleSort(int[] arr) {
        if (arr == null) {
            return ;
        }
        if(arr.length <=1) {
            return ;
        }
        for (int i = 0; i < arr.length-1; i++) {
            boolean flag=false;
            //4   3   2   1
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =tmp;
                    flag =true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }
    public void selectSortSolo(int[] arry) {
        for (int left = 0; left < arry.length-1; left++) {
            int minIndex = left;
            for (int i = left+1; i < arry.length; i++) {
                if (arry[i] > arry[minIndex]) {
                }
            }
            swap(arry,left,minIndex);
        }
    }
    public void selectSort(int[] arry) {
        int left=0;
        int right = arry.length-1;
        int minIndex=0;
        int maxIndex=0;
        while (left < right)
            minIndex = left;
            maxIndex = left;
        for (int i = left+1; i <= right; i++) {
            if(arry[i] < arry[minIndex]) {
                minIndex = i;
            }
            if(arry[i] > arry[maxIndex]) {
                maxIndex = i;
            }
        }
        swap(arry,left,minIndex);
        if (maxIndex == left) {
            maxIndex = minIndex;
        }
        swap(arry,right,maxIndex);
        left++;
        right--;
    }
    public static int contion(int[] arry,int left,int right) {
        int key = arry[left];
        int l=left+1;
        int t = left;
        while (l < right) {
            while (arry[right] < key) {
                right--;
            }
            while (arry[l] > key) {
                l++;
            }
            swap(arry,l,right);
        }
        swap(arry,t,l);
        return l;
    }
    public void quick(int[] arry,int left,int right) {
        if(left <= right) {
            return ;
        }
        int contion = contion(arry,left,right);
        quick(arry,left,contion-1);
        quick(arry,contion+1,right);

    }
        public void quickSort(int[] arry,int start,int end) {
             quick(arry,0,arry.length-1);
        }


}