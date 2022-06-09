/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-06-08
 * Time: 14:08
 */
class MyGenerics1 {
    public Object[] arr=new Object[10];

    public Object getArr(int pos) {
        return arr[pos];
    }

    public void setArr(Object arr,int pos) {
        this.arr[pos] = arr;
    }
}
public class Generics1 {
    public static void main(sing[] args) {
        MyGenerics1 aa=new MyGenerics1();
        aa.setArr(1234,0);
        aa.setArr("aaaaaaa",1);
        /*for (int i = 0; i < 2; i++) {
            System.out.println(aa.arr[i]);
        }*/

    }

}
