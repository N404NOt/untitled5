package Sort;
import java.util.Arrays;
import java.util.Random;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-07-30
 * Time: 15:07
 */
public class Sort {
    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int end = i-1;
            int key = array[i];
            while (end >=0 && array[end] > key) {
                array[end+1] = array[end];
                end--;
            }
            array[end+1] = key;
        }

    }
    public static void shellSort(int[] array) {
        int gap = array.length-1;
        while(gap > 1) {
            gap = gap/3+1;
            for (int i = gap; i < array.length ; i++) {
                int end = i-gap;
                int key = array[i];
                while (end >=0 && array[end] >key) {
                    array[end+gap] =array[end];
                    end -= gap;
                }
                array[end+gap] = key;
            }
        }

    }
    public static void swap(int[] array,int minIndex,int maxIndex) {
        int tmp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = tmp;
    }
    public static void selectSort(int[] array) {
        int begin =0;
        int end = array.length-1;
        while(begin < end) {
            int index = begin+1;
            int minIndex = begin;
            int maxIndex = begin;
            while (index <= end) {
                if(array[index] < array[minIndex]) {
                    minIndex = index;
                }
                if(array[index] > array[maxIndex]) {
                    maxIndex = index;
                }
                index++;
            }
            if(maxIndex != end) {
                swap(array,maxIndex,end);
            }
            if(minIndex == end){
                minIndex = maxIndex;
            }
            if(minIndex != begin) {
                swap(array,minIndex,begin);
            }
            begin++;
            end--;
        }
    }
    public static void dissortTime2() {
        Random random = new Random();
        int[] array=new int[10_0000];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        long startTime =  System.currentTimeMillis();
        selectSort(array);
        long endTime = System.currentTimeMillis();
        System.out.println("选择无序时间为:"+(endTime - startTime));
    }
    public static void sortTime2() {
        Random random = new Random();
        int[] array = new int[10_0000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        long startTime =  System.currentTimeMillis();
        selectSort(array);
        long endTime = System.currentTimeMillis();
        System.out.println("选择有序时间为:"+(endTime - startTime));
    }
    public static void dissortTime() {
        Random random = new Random();
        int[] array=new int[10_0000];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        long startTime =  System.currentTimeMillis();
        shellSort(array);
        long endTime = System.currentTimeMillis();
        System.out.println("希尔无序时间为:"+(endTime - startTime));
    }
    public static void dissortTime1() {
        Random random = new Random();
        int[] array=new int[10_0000];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        long startTime =  System.currentTimeMillis();
        insertSort(array);
        long endTime = System.currentTimeMillis();
        System.out.println("直接无序时间为:"+(endTime - startTime));
    }
    public static void sortTime() {
        Random random = new Random();
        int[] array = new int[10_0000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        long startTime =  System.currentTimeMillis();
        shellSort(array);
        long endTime = System.currentTimeMillis();
        System.out.println("希尔有序时间为:"+(endTime - startTime));
    }
    public static void sortTime1() {
        Random random = new Random();
        int[] array = new int[10_0000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        long startTime =  System.currentTimeMillis();
        insertSort(array);
        long endTime = System.currentTimeMillis();
        System.out.println("直接有序时间为:"+(endTime - startTime));
    }
    public static void main(String[] args) {
        dissortTime();
        dissortTime1();
        dissortTime2();
        sortTime();
        sortTime1();
        sortTime2();
    }
}
