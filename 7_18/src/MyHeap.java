import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-07-18
 * Time: 20:57
 */
public class MyHeap {
    public int[] elem;
    int usedSize;
    public void initHeap() {
        this.elem = new int[10];
        usedSize =0;
    }
    public MyHeap() {

    }
    public MyHeap(int[] arr) {
        elem = arr;
        usedSize = arr.length;
    }
    public void creatHeap() {
        for (int i = (usedSize-1-1)/2; i >=0; i--) {
            shiftDown(i,usedSize);
        }
    }
    public void shiftUp(int index) {
        int parent = (index-1)/2;
        while (index > 0 ) {
            if(elem[index] > elem[parent]) {
                swap(elem,parent,index);
                index = parent;
                parent = (index-1)/2;
            } else {
                break;
            }
        }
    }
    public void shiftDown(int parent,int len) {
        int child = parent*2+1;
        while (child < len) {
            if(child+1 <len && elem[child+1] > elem[child]) {
                child++;
            }
            if(elem[child] > elem[parent]) {
                int tmp = elem[child];
                elem[child] = elem[parent];
                elem[parent] = tmp;
                parent = child;//开始更新下标，继续看下面的子树是不是大根堆
                child = 2*parent+1;
            } else {
                break;
            }

        }
    }
    private void swap(int[] arr,int a,int b) {
        isEmpty();
        if (usedSize < 2) {
            return;
        }
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
    private boolean isEmpty() {
        return usedSize == 0;
    }
    public void heapSort() {
        int len=usedSize-1;
        while (len >0) {
            swap(this.elem, 0,len);
            shiftDown(0,len);
            len--;
        }
    }

    public static void main(String[] args) {
        int[] array = { 27,15,19,18,28,34,65,49,25,37 };
        MyHeap myHeap = new MyHeap(array);
        System.out.println(Arrays.toString(myHeap.elem));
        myHeap.creatHeap();
        System.out.println(Arrays.toString(myHeap.elem));
        myHeap.heapSort();
        System.out.println(Arrays.toString(myHeap.elem));
    }
}
