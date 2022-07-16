import java.lang.invoke.SerializedLambda;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-07-16
 * Time: 22:50
 */
public class MyHeap {
    public int[] elem;
    public int usedSize;
    public MyHeap() {
        this.elem = new int[10];
        this.usedSize=0;
    }
    private void shiftDown(int root,int len) {
        int child = root*2+1;
        while(child < len) {
            if(child+1 < len && elem[child] < elem[child+1]) {
                child++;
            }
            if(elem[root] <elem[child]) {
                swap(root,child);
                root=child;
                child=root*2+1;
            } else {
                break;
            }

        }

    }
    public void swap(int a,int b) {
        int tmp=elem[a];
        elem[a]=elem[b];
        elem[b]=tmp;
    }


    /**
     * 入队：仍然要保持是大根堆
     * @param val
     */
    public void push(int val) {
        if(isFull()) {
            this.elem= Arrays.copyOf(elem,elem.length*2);
        }
        elem[usedSize] = val;
        usedSize++;
        shiftUp(usedSize-1);

    }

    private void shiftUp(int child) {
        int parent = (child-1) / 2;
        while (child > 0) {
            if(elem[child] > elem[parent]) {
                swap(child,parent);
                child = parent;
                parent = (child-1) / 2;
            }else {
                break;
            }
        }
    }

    public boolean isFull() {
        return usedSize == elem.length;
    }

    /**
     * 出队【删除】：每次删除的都是优先级高的元素
     * 仍然要保持是大根堆
     */
    public void pollHeap() {
        if(isEmpty()) {
            return ;
        }
        int old = elem[0];
        swap(0,usedSize-1);
        usedSize--;
        shiftDown(0,usedSize);
    }

    public boolean isEmpty() {
        return usedSize == 0;
    }

    /**
     * 获取堆顶元素
     * @return
     */
    public int peekHeap() {
        return elem[0];
    }
    public void creatHeap(int[] arr) {
        this.elem=arr;

    }
}
