/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-10
 * Time: 1:12
 */
class student {
    public int age;
    public String name;
    public int classs;

    public void print() {
        System.out.println(this.name+this.name+classs);
    }
    int a=9;
    public int test2(int a){
        a=a;
        //System.out.println(a);
        return a;
    }
    public student(){
        System.out.println("aaaaaaaaaaaaa");
    }
    public student(int a){
        System.out.println("hhhhhhhh");
    }
}
public class Test1 {

    public static void main(String[] args) {
        student st1 = new student();
        st1.age=11;
        st1.name="xukai";
        st1.classs=123456;
        st1.test2(5);
        int a=4;
        System.out.println(st1.test2(a));

    }
    public static void main1(String[] args) {
        int[][]arr={{1,2,3,4,5},{5,6,8}};
/*        arr[0]=new int[]{1,2,3,4};
        arr[1]=new int[5];*/
       /* System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);*/
        /*for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }*/
       // System.out.println(Arrays.deepToString(arr));
        for (int[]a:arr  ) {
            for (int b:a       ) {
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}
