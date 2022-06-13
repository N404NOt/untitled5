import com.sun.corba.se.impl.orbutil.closure.Constant;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-06-13
 * Time: 10:04
 */
public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(45);
        list1.add(1);
        list1.add(-9);
        list1.add(32);
        ListIterator<Integer> lt=list1.listIterator();
        while(lt.hasNext()) {
            System.out.print(lt.next()+" ");
        }
        System.out.println();
        Collections.sort(list1);
        ListIterator<Integer> lt2=list1.listIterator();
        while(lt2.hasNext()) {
            System.out.print(lt2.next()+" ");
        }
        System.out.println();
        Collections.reverse(list1);
        System.out.println(list1);
    }
    public static void main1(String[] args) {
        ArrayList<String> list1=new ArrayList<>();
        List<String> list=new ArrayList<>(10);
        list.add("aaa");
        list.add("bbb");
        list.remove(1);
        list.add("ccc");
        list.add("ddd");
        list.add("aaa");
        boolean a=list.contains("aaa");

        ListIterator<String> lt=list.listIterator();
        while(lt.hasNext()) {
            String c=lt.next();
            System.out.print(c+" ");
            if(c==list.get(list.size()-1)) {
                lt.add("hahahaha");
            }
        }
        String qqqq = "qqqq";
        list.replaceAll(e->e.replaceAll("aaa","qqq"));
        System.out.println(list);

    }
}
