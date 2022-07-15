/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-07-16
 * Time: 0:33
 */
public class Deo1 {
    int[] elem;
    int usedSize;
    public Deo1() {
        this.elem = new int[10];
        this.usedSize = 0;
    }
    public void initHeap(int[] arr) {
        this.elem = arr;
        this.usedSize = arr.length;
    }
    private void shifDown(int parent) {
        int child = 2*(parent+1);
        while(child < usedSize) {
            if(child+1<usedSize && elem[child+1] > elem[child]) {
                child++;
            }
            if(elem[child] > elem[parent]) {
                swap(elem,child,parent);
            }
        }

    }
    private void swap(int[] array,int i,int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
    private void shifUp() {

    }
}
