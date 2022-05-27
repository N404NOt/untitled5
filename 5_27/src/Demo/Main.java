package Demo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-27
 * Time: 19:56
 */
public class Main {


    public static void main(String[] args) {
        String arr1=new String("aaaaa");
        String arr2=new String("aaaaa");
        System.out.println(arr1==arr2);
        System.out.println(arr1.equals(arr2));
        System.out.println(arr1.compareTo(arr2));
        /*int a=Integer.valueOf("222222");
        int a2=Integer.parseInt("1111");
        char[] a3=(char[]){1,2,3,4};
        char[] ch={'a','v','e'};
        String arr3=new String(ch);
        String arr4=new String(a3);
        System.out.println(arr3);*/
        /*String arr= new String(String.valueOf(a3));
        System.out.println(a);
        System.out.println(a2);
        System.out.println(arr);*/
    }
}
