import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-07
 * Time: 23:46
 */
public class TestDemo1 {
    public static String myToString(int[] arr){
        String tmp;
        tmp="[";
        int key=1;
        for (int x:arr) {
            tmp=tmp+x;
            if(key!=arr.length){
                tmp+=',';
            }
            key++;
        }
        tmp=tmp+']';
        return tmp;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(myToString(arr));
    }
    public static int[] myCopyOf(int[] arr,int length){
        int[] copy=new int[length];
        for (int i = 0; i < length; i++) {
            copy[i]=arr[i];
        }
        return copy;
    }
    public static void main7(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int[] arr={1,2,3,5,6,7,8};
        //System.out.println(Arrays.toString(Arrays.copyOf(arr, arr.length)));
        int[] copy=myCopyOf(arr,arr.length);
        System.out.println(Arrays.toString(copy));
    }
    public static int myBinarySearch(int[] arr,int key){
        int low=0;
        int high=arr.length-1;
        int mid=(low+high)/2;
        while(low<high){
            if(arr[mid]==key&&mid<=high&&mid>=low){
                return mid;
            }else if(arr[mid]<key){
                low=mid+1;
            }else{
                high=mid-1;
            }
            mid=(low+high)/2;
        }
        return -(low+1);
    }

    public static void main6(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int a=Arrays.binarySearch(arr,80);
       // System.out.println(a);
        System.out.println(myBinarySearch(arr,80));
    }
    public static boolean judgIsSort(int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main5(String[] args){
        int[] arr={1,2,3,4,5,6};
        int[] arr1={2,6,1,2};
        System.out.println(judgIsSort(arr));
        System.out.println(judgIsSort(arr1));
    }
    public static int[] bubbleSort(int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            boolean judg=true;
            for (int j = 0; j <arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                    judg=false;
                }

            }if(judg==true){
                System.out.println("在第"+i+"次提前结束循环的"+arr.length+"次数");
                return arr;
            }
        }
        return arr;
    }

    public static void main4(String[] args) {
        int[]arr={9,1,3,4,2,11};
        String ste=Arrays.toString(bubbleSort(arr));
        System.out.println(ste);
    }
    public static int[] findTarget(int[]arr,int target){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int[]arr1={0,0};
        for (int i = 0; arr[i]<=target; i++) {
            for (int j = 1; j <arr.length; j++) {
                if(arr[i]+arr[j]==target){
                    arr1[0]=i;
                    arr1[1]=j;
                    return arr1;
                }
            }
        }
        arr1[0]=-1;
        arr1[1]=-1;
        return arr1;
    }

    public static void main3(String[] args) {
        int[]arr={6,8,0,2,4,6,-2};
        int[]arr1=findTarget(arr,4);
        String str=Arrays.toString(arr1);
        System.out.println(str);
    }
    public static int[] oneToHunderMethod(){
        int[]arr=new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i]=i+1;
        }
        return arr;
    }

    public static void main2(String[] args) {
        int[]arr=oneToHunderMethod();
        for (int i = 0; i < 100; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] transForm(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        return arr;
    }
    public static void main1(String[] args) {
        int[]arr=new int[]{1,2,3};
        int[]arr1=transForm(arr);
        for (int x:arr1) {
            System.out.println(x);
        }
        String arr2= Arrays.toString(arr1);
        System.out.println(arr2);
    }
}
