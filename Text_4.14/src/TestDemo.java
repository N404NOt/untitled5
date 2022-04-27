import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-04-17
 * Time: 22:23
 */
 public class TestDemo {
     public static int nFactor(int n){
         int sum=1;
         for (int i = 1; i < n; i++) {
             sum+=sum*i;
         }
         return sum;
     }
    public static void main(String[] args) {
        System.out.println(nFactor(4));

    }
     //在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
    public static double treMax(int a, double b, double c){
        double t=a>b?a:b;
        return t>c?t:c;
    }
    public static double towFMax(double a, double b){
        return  (a>b?a:b);
    }
    public static int towIMax(int a,int b){
        return a>b?a:b;
    }
    public static void main21(String[] args) {
        System.out.println(towIMax(4, 9));
        System.out.println(towFMax(9.6, 4.1));
        System.out.println(treMax(9, 1.1, 4.4));


    }
     //有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
    public static int findDog(int[]arr,int n){
        int num=0;
        for (int i = 0; i < n; i++) {
            num^=arr[i];
        }
        return num;
    }
    public static void main20(String[] args) {
        int [] arr={1,1,9,9,4};
        int n=arr.length;
        System.out.println(findDog(arr,n));

    }
    //求1！+2！+3！+4！+........+n!的和
    public static int nSum(int n){
        int sum=1;
        int num=1;
        for (int i = 2; i <=n ; i++) {
            sum=sum*i;
            num=num+sum;
        }
        return num;
    }
     //在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果
    public static int towSum(int a,int b){
        return a+b;
    }
    public static double treSum(double a,double b, double c){
        return a+b+c;
    }

    public static void main19(String[] args) {
    /*    System.out.println(towSum(4,5));
        System.out.println(treSum(1.2,6.3,2.4));*/
        //System.out.println(Math.pow(2,4));
        System.out.println(nSum(4));
    }
    public static void main18(String[] args) {
        Scanner scanner =new Scanner(System.in);
        if(scanner.hasNext()){
            String a="aaaa";
            a=scanner.next();
            System.out.println(a);
        }
    }
    public static void main17(String[] args) {
        int a=9;
       double b= Math.sqrt(a);
    }
    public static void main16(String[] args) {
        int count=0;
        for (int i = 1; i <100 ; i++) {
            int b=i%10;
            int t=i/10;
            if((b==9)||(t==9)){
                count++;
            }
        }
        System.out.println(count);

    }
    public static void main15(String[] args) {
        a:for(int x = 2;x <= 100;x++){
            for(int y = 2;y < x;y++){
                if(x % y == 0){
                  break a;//本来是结束本次循环,这里加了标签,直接结束本次最外边的for循环
                }
            }//该%的数字都已经%完
            System.out.println(x);
        }

    }
    public static void main14(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i = 2; i <n/2+1 ; i++) {
            if(n%i==0){
                System.out.println(n+"不是素数！");
                return;
            }
        }
        System.out.println(n+"是素数！");

    }
    public static void main13(String[] args) {

        for (int i = 1; i < 101; i++) {
            int key = 0;
            for (int j = 1; j < 51 && j < i; j++) {
                if (i % j != 0) {
                    key = 1;
                    break;
                }

            }
            if (key == 0) {
                System.out.println(i + "是素数！");
            }
        }}
    public static void main12(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        for (int i = 2; i < 50; i++) {
            if(n%i==0){
                System.out.println(n+"是素数！");
            }
        }
    }
    public static void main11(String[] args) {
        for (int i = 1000; i < 2001; i++) {
            if(i%4==0&&i%100!=0){
                System.out.println(i+"是闰年");
            }else if(i%400==0){
                System.out.println(i+"是闰年");
            }
        }
    }
    public static void main10(String[] args) {
        int n,m;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        m=scanner.nextInt();
        for (int i = (n>m?m:n); i>0; i--) {
            if(n%i==0&&m%i==0) {
                System.out.println("最大公约数为：" + i);
                return;
            }
        }
    }

    public static void main9(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        while(scanner.hasNextInt()){
            n=scanner.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if((j==i)||(j+i==n-1)){
                        System.out.print('*');
                    }else{
                        System.out.print(' ');
                    }
                }
                System.out.println();
            }
        }
    }

    /**
     * 0~999的水仙花数
     * @param args
     */
    public static void main8(String[] args) {
        int b,t,h;
        int num=0;
        while(num<=999){
            b=num%10;
            t=(num-b)/10%10;
            h=(num-t-b)/100%10;
            int sum=((int)Math.pow(b,3))+((int)Math.pow(t,3))+((int)Math.pow(h,3));
            if(sum==num){
                System.out.println(num);
            }
            num++;
        }
    }
    /**
     * 三次密码
     * @param args
     */
    public static void main7(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //TODO:
        String passnum1;
        String passnum2;
        int a;
        int b;
        while(true) {
            System.out.println("请设置一个密码>");
           // a = scanner.nextInt();
             passnum1=scanner.nextLine();
            System.out.println("请确认密码>");
           // b = scanner.nextInt();6
            passnum2=scanner.nextLine();
            if (passnum1.equals(passnum2)) {
                System.out.println("密码设置成功！");
                break;
            } else {
                System.out.println("密码错误！重新输入！");
            }
        }
            int count=0;
            String passnum;
            while(count<3){
                System.out.println("第"+count+1+"次输入密码");
                System.out.println("请输入密码>");
                passnum=scanner.nextLine();
                if(passnum.equals(passnum1)){
                    System.out.println("登录成功！");
                    return;
                }else{
                    System.out.println("密码错误");
                    count++;
                }
            }
        System.out.println("登录失败！");
        }


    public static void main6(String[] args) {
        System.out.println("hahaha".endsWith("a"));
        System.out.println("aaa");
    }
    /**
     * 九九乘法表
     * @param args
     */
    public static void main5(String[] args) {
        int n=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please inout your number>");
        n=scanner.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+"*"+i+"="+(i*j)+" ");
            }
            System.out.println("\n");
        }
    }
    /**
     * Random的种子相同时产生的随机数相同,但是使用次数不同产生的随机数不同
     * @param args
     */
    public static void main4(String[] args) {
        Random random=new Random();
        Random r2=new Random();
        char a=(char)(Math.random()+128);
        int num=random.nextInt();
        System.out.println(num);

      /*  int rannum=random.nextInt();
        System.out.println(rannum);
        int a=r2.nextInt();
        int b=r2.nextInt();
        System.out.println(a);
        System.out.println(b);*/
        /*boolean a=random.nextBoolean();
        System.out.println(a);
        float r=r2.nextFloat();
        System.out.println(r);*/
    }
    public static void main3(String[] args) {
        String str;
        while(true){
            Scanner scan=new Scanner(System.in);
            str=scan.nextLine();
            System.out.println(str);
        }

    }
    public static void main2(String[] args) {
        Scanner scan=new Scanner(System.in);
        int i=0;
        System.out.println("Please input your"+ i+" number:");
        int a=0;
        while(scan.hasNextInt()){
            System.out.println(a);
            System.out.println("Please input your"+ i+" number:");
            a=scan.nextInt();
            i++;
        }
    }
     public static void main1(String[] args){
         String str="abcdef";
         String arr="1234";
         int a=10000;
         System.out.println(Integer.parseInt(arr)+1);
         System.out.println(String.valueOf(a));
         System.out.println(Integer.MAX_VALUE);
         System.out.println(str.length());
         System.out.println(str.replace('e','a'));
         System.out.println(str.toUpperCase());

     }
}
