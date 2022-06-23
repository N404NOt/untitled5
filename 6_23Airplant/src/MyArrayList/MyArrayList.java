package MyArrayList;

import any.Message;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-06-23
 * Time: 14:04
 */
public class MyArrayList {
    private Message[] elementdate;

    public Message getElementdate(int index) {
        return elementdate[index];
    }

    private int usdSize=0;
    private static final Message[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA= {};
    private static final int MAX_ARRAY_SIZE= Integer.MAX_VALUE-8;
    private static final int DEFAULT_CAPACITY = 10;
    public MyArrayList() {
        this.elementdate=DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }
    public MyArrayList(int initialCapacity) {
        if(initialCapacity == 0) {
            this.elementdate=DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
        } else if(initialCapacity>0) {
            this.elementdate=new Message[initialCapacity];
        } else {
            throw new IllegalArgumentException("IllegalArgument:"+ initialCapacity);
        }
    }
    public int size() {
        return this.usdSize;
    }
    public boolean add(Message val) {
        //rangCheckForAdd(usdSize + 1);
        ensureCapcityInternal(usdSize+1);
        elementdate[usdSize++]=val;
        return true;
    }
    private void rangCheckForAdd(int index,Message[] messages) {
        if(index < 0 || index >usdSize) {
            throw new IllegalArgumentException("数组添加位置不存在！");
        }
    }
    private void  ensureCapcityInternal(int minSize) {
        ensureExplicitCapacity(calculateCapcity(minSize,elementdate));
    }
    private int calculateCapcity(int minSize,Message[] elementdate) {
        if(elementdate == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
            return Math.max(DEFAULT_CAPACITY, minSize);
        }
        return minSize;
    }
    public void ensureExplicitCapacity(int minCapcity) {
        if(minCapcity-elementdate.length>0) {
            grow(minCapcity);
        }
    }
    private void grow(int minCapacity) {
        int oldCapacity = elementdate.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);//1.5倍扩容
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
        if (newCapacity - MAX_ARRAY_SIZE > 0)
            newCapacity = hugeCapacity(minCapacity);
        // minCapacity is usually close to size, so this is a win:
        elementdate = Arrays.copyOf(elementdate, newCapacity);
    }
    private static int hugeCapacity(int minCapacity) {
        if (minCapacity < 0) // overflow
            throw new OutOfMemoryError();
        return (minCapacity > MAX_ARRAY_SIZE) ?
                Integer.MAX_VALUE :
                MAX_ARRAY_SIZE;
    }


}
