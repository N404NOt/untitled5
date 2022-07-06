package myList;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-06-13
 * Time: 10:26
 */
class MyArrayList<E> {
    ArrayList  arrayList =new ArrayList();
    private  Object[] elementDate;//初始数组
    private int usedSize;
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
    private static final int DEFAULT_CAPACITY=10;
    private static final int MAX_ARRAY_SIZE= Integer.MAX_VALUE-8;

    public MyArrayList() {
        this.elementDate=DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }
    int indexOf(Object e) {
        for (int i = 0; i < elementDate.length ;i++) {
            if(e==elementDate[i]) {
                return i;
            }
        }
        return -1;
    }

    public MyArrayList(int initialCapacity) {
        if(initialCapacity>0) {
            this.elementDate=new Object[initialCapacity];
        } else if(initialCapacity==0) {
            this.elementDate=new Object[0];
        } else {
            throw new IllegalArgumentException("数组容量异常");
        }
    }
    public boolean add(int index,E e) {
        rangeCheckForAdd(index);
        ensureCapacityInternal(usedSize+1);
        System.arraycopy(elementDate,index,elementDate,index+1,size()-index);
        elementDate[index]=e;
        usedSize++;
        return true;
    }
    private  void copy(Object[] elementDate,int index) {
        for (int i = size(); i >index; i--) {
            elementDate[i]=elementDate[i-1];
        }
    }
    private void rangeCheckForAdd(int index) {
        if(index<0 || index> size()) {
            throw new IndexOutOfBoundsException("添加元素越界异常");
        }
    }
    public int size() {
        return usedSize;
    }

    public boolean add(E e) {
        ensureCapacityInternal(usedSize+1);
        elementDate[usedSize++]=e;
        return true;
    }
    private void ensureCapacityInternal(int minCapacity) {
        ensureExplicitCapacity(calculateCapacity(elementDate,minCapacity));
    }

    private void ensureExplicitCapacity(int minCapacity) {
        if(minCapacity-elementDate.length>0) {
            grow(minCapacity);
        }
    }
    private static int calculateCapacity(Object[] elementData, int minCapacity) {
        if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
            return Math.max(DEFAULT_CAPACITY, minCapacity);
        }
        return minCapacity;
    }
    private void grow(int minCapacity) {
        // overflow-conscious code
        int oldCapacity = elementDate.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);//1.5倍扩容
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
        if (newCapacity - MAX_ARRAY_SIZE > 0)
            newCapacity = hugeCapacity(minCapacity);
        // minCapacity is usually close to size, so this is a win:
        elementDate = Arrays.copyOf(elementDate, newCapacity);
    }
    private static int hugeCapacity(int minCapacity) {
        if (minCapacity < 0) // overflow
            throw new OutOfMemoryError();
        return (minCapacity > MAX_ARRAY_SIZE) ?
                Integer.MAX_VALUE :
                MAX_ARRAY_SIZE;
    }

}
public class MyList{
    public static void main(String[] args) {
        MyArrayList<String> myArrayList=new MyArrayList<>();
        myArrayList.add("asd");
        myArrayList.add("qwe");
        myArrayList.add("rrrr");
        System.out.println(myArrayList.size());
    }
}