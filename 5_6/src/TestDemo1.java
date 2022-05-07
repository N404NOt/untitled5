import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-06
 * Time: 19:14
 */
public class TestDemo1 {
    public static int myBinarySearch(int[] arr,int keys){

    }
    public static void main(String[] args) {
        int[]arr={6,9,3,4,6,7,2,0};
        int[]copy=new int[arr.length];
      /*  copy= Arrays.copyOf(arr,arr.length);
        copy[0]=88;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copy));*/
        //copy=arr.clone();
  /*      copy[1]=99;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copy));*/
       /* System.arraycopy(arr,1,copy,3,2);
        System.out.println(Arrays.toString(copy));*/
        Arrays.sort(arr);
        int a=Arrays.binarySearch(arr,0);
        System.out.println(a);

    }
}
