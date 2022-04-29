/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-04-27
 * Time: 23:46
 */
public class TestDemo {
    //Sequential print each bit of a num
    public static void seqPrtEcNm(int n){
        if(n<0){
            return;
        }
    }
    // Print backwards each bit of a num
    public static void prtEcNm(int n){
        int count=0;
        if(n<10){
            System.out.print(n);
            return;
        }else{
            System.out.print(n%10+" ");
            prtEcNm(n/10);
        }
    }

    public static void main5(String[] args) {
        prtEcNm(1234);
    }
    //The sum of each bit that makes up this number;
    public static int  sOfDigitNum(int n){
        int tmp;
        if(n<0){
            return -1;
        }
        else if(n<10){
            return n;
        }else{
            tmp=n%10+sOfDigitNum(n/10);
        }
        return tmp;
    }

    public static void main4(String[] args) {
        System.out.println(sOfDigitNum(12345));
    }
    //one to the sum of the numbers themselves
    public static int numSum(int n){
        int tmp;
        if(n==1){
            return 1;
        }else{
             tmp=numSum(n-1)+n;
        }
        return tmp;
    }

    public static void main3(String[] args) {
        System.out.println(numSum(5));
    }
    //ForFibonacci
    public static int FfBnc(int n){
        if(n<0){
            return -1;
        }
        if(n==1||n==2){
            return 1;
        }
        int tmp1=1;
        int tmp2=1;
        int tmp3=1;
        for (int i = 2; i <n; i++) {
            tmp1=tmp2;
            tmp2=tmp3;
            tmp3=tmp1+tmp2;
        }
        return tmp3;
    }
    //Fibonacci迭代
    public static int fBnc(int n){
        if(n==1||n==2){
            return 1;
        }
        int tmp=fBnc(n-1)+fBnc(n-2);
        return tmp;
    }

    public static void main2(String[] args) {
        System.out.println(fBnc(3));
        System.out.println(fBnc(4));
        System.out.println(fBnc(5));
        System.out.println(fBnc(6));
        System.out.println(fBnc(9));
        System.out.println(FfBnc(9));

    }
    public static void main1(String[] args) {
        int[]arr;
       // arr={1,2,3};
        int[]arr1=new int[]{1,2,3,4,5};
        int[]arr2=new int[5];
        for(int x:arr1){
            System.out.println(x);
        }
       /* arr=new int[]{1,2,3,4};
        for(int x:arr){
            System.out.println(arr[x]);
        }*/

    }
}
