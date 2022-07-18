import java.util.Arrays;

public class TestHeap {
    public int[] elem;
    public int usedSize;

    public TestHeap() {
        this.elem = new int[10];
    }

    /**
     * 建堆的时间复杂度：
     *
     * @param array
     */
    public void createHeap(int[] array) {
        //这一步不算是必须的。这里只是我们准备数据，不算做我的建堆时间复杂度当中
        for (int i = 0; i < array.length; i++) {
            elem[i] = array[i];
            usedSize++;
        }

        for (int p = (usedSize-1-1)/2; p >= 0 ; p--) {
            shiftDown(p,usedSize);
        }
    }

    /**
     *
     * @param root 是每棵子树的根节点的下标
     * @param len  是每棵子树调整结束的结束条件
     * 向下调整的时间复杂度：O(logn)
     */
    private void shiftDown(int root,int len) {
        int parent = root;
        int child = 2*parent+1;
        //进入这个循环，说明一定至少有一个孩子
        while (child < len) {
            //如果有孩子，找到左右孩子的最大值
            if(child+1 < len && elem[child] < elem[child+1]) {
                child++;
            }
            //child下标一定保存的是左右孩子最大值的下标
            //接下来，孩子的最大值和根节点去比较大小
            if(elem[child] > elem[parent]) {
                int tmp = elem[child];
                elem[child] = elem[parent];
                elem[parent] = tmp;
                parent = child;//开始更新下标，继续看下面的子树是不是大根堆
                child = 2*parent+1;
            }else {
                break;//此时说明已经是大根堆，不需要进行再次调整了
            }
        }
    }


    /**
     * 入队：仍然要保持是大根堆
     * @param val
     */
    public void push(int val) {
        if(isFull()) {
            elem = Arrays.copyOf(elem,2*elem.length);
        }
        //1、放到最后的位置
        elem[usedSize] = val;
        //2、进行向上调整
        shiftUp(usedSize);
        //3、有效数据+1
        usedSize++;
    }

    private void shiftUp(int child) {
        int parent = (child-1) / 2;
        while (child > 0) {
            if(elem[child] > elem[parent]) {
                int tmp = elem[child];
                elem[child] = elem[parent];
                elem[parent] = tmp;
                child = parent;
                parent = (child-1)/2;
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
            System.out.println("优先级队列为空！");
            return;
        }
        int tmp = elem[0];
        elem[0] = elem[usedSize-1];
        elem[usedSize-1] = tmp;
        usedSize--;//9
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
        if(isEmpty()) {
            System.out.println("优先级队列为空！");
            return -1;
        }
        return elem[0];
    }
    /*public static void main(String[] args) {
        int[] arr= {9, 1, 5, 3, 4, 8, 6, 0};
        MyHeap myHeap = new MyHeap(arr);
        System.out.println(Arrays.toString(myHeap.elem));
        myHeap.creatHeap();
        System.out.println(Arrays.toString(myHeap.elem));
    }*/
    public static void main(String[] args) {
        TestHeap testHeap = new TestHeap();
        int[] array = { 27,15,19,18,28,34,65,49,25,37 };
        testHeap.createHeap(array);
        System.out.println(Arrays.toString(testHeap.elem));
        //testHeap.push(50);
        //testHeap.pollHeap();
        System.out.println("fafaa");
    }

}