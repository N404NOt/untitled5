import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-25
 * Time: 10:17
 */
public class TestDemo1 {


    public static void main(String[] args) throws UnsupportedEncodingException {
       /* String str="abcd";
        str+="1234";
        System.out.println(str);*/
       /* char[] arr={'a','b','b'};
        byte[] b={97,65,23};
        String arr1= new String(arr,0,2);
        System.out.println(arr1);
        System.out.println(arr1.charAt(0));
        String arr2="ab123456qq";
        char temp;
        boolean flg;
        for (int i = 0; i < arr2.length(); i++) {
            temp=arr2.charAt(i);
            flg=Character.isDigit(temp);
            System.out.println(flg);
        }
        char[] arr3=arr2.toCharArray();
        String barr=new String(b);
        System.out.println(barr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr3));*/
       /* String arr="abcedf";
        byte[] barr;
        char[] carr;
        carr=arr.toCharArray();
        barr=arr.getBytes();
        System.out.println(Arrays.toString(barr));
        System.out.println(Arrays.toString(carr));
        String str2="abcd徐1234";
        byte[] arr2=str2.getBytes("utf-8");
        System.out.println(Arrays.toString(arr2));
        byte[] arr3=str2.getBytes("GBK");
        System.out.println(Arrays.toString(arr3));*/
       /* String arr1="Abcd";
        String arr2="abcde";
        int ret=arr1.compareToIgnoreCase(arr2);
        System.out.println(arr1.equalsIgnoreCase(arr2));
        byte[] arr3={97,98,99};
        String arr4=new String(arr3);
        System.out.println(arr4);
        System.out.println(ret);
        String arr1="01234567";
        String arr2="4";
        String arr3=" ";
        boolean ret=arr1.contains(arr3);
        int index=arr1.lastIndexOf(arr2,2);
        System.out.println(index);
        System.out.println(ret);
        System.out.println(arr1.startsWith("0"));
        System.out.println(arr1.endsWith("67"));*/
        /*String arr1="ababcfder";
        String arr2=arr1.replace("ab","cccc");
        String arr3=arr1.replaceFirst("a","e");
        String arr4=arr1.replace('a','e');
        String arr5=arr1.replaceAll("ab","ee");
        System.out.println(arr2);
        System.out.println(arr3);
        System.out.println(arr5);*/
       /* String arr1="a*bc!as@dsd!d1dd!ee$e";
        String[] str=arr1.split("");
       *//* for (String s:str) {
            System.out.println(s);
        }*//*
        System.out.println(str);*/
       /* String arr1="     abc    def    ";
        String sub=arr1.substring(2,5);
       // System.out.println(sub);
        String arr2=arr1.trim();
        System.out.println(arr2);
        System.out.println(arr1);
        //System.out.println(arr1.toUpperCase());
        //System.out.println(arr1.toLowerCase());
        String arr3=arr1.concat("lllll");
        System.out.println(arr3);
        System.out.println(arr1);*/
        /*String arr="abcdef";
        char[]ch={'a','b','e'};
        StringBuilder sb=new StringBuilder();
        sb.append(2345);
        sb.append("aaaaa");
        sb.append('r').append("ererererer");
        System.out.println(sb);
        System.out.println(sb.toString());*/
        //System.out.println(arr.toString());
        //System.out.println(Arrays.toString(ch));
        //System.out.println(Arrays.toString(sb));
        /*String arr="aaaa";
        arr+="qqqq";
        System.out.println(arr);*/
        /*StringBuilder sb=new StringBuilder();
        sb.append("aaaaa");
        sb.append('d');
        sb.append("eeee");
        String arr=new String(sb);
        arr=sb.toString();
        System.out.println(sb);
        StringBuilder arr2=sb.reverse();
        System.out.println(sb);*/
        StringBuffer sb=new StringBuffer();
        sb.append("adasdsdsd").append("eeeeeeeeeee");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

    }

}
