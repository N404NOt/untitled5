import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-06-12
 * Time: 16:54
 */
public class TestDeno1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>(2);
        list.add("qweqwe");
        list.add("asd");
        list.add("opo");
        System.out.println(list);
        /*ListIterator lt=list.listIterator();
        while(lt.hasNext()) {
            System.out.println(lt.next());
        }*/
        List<String> b=list.subList(0,3);
        int a=list.indexOf("opo");
        System.out.println(a);
        b.set(0,"wwwww");
        System.out.println(b==list);
        System.out.println(list.get(0)==b.get(0));
        System.out.println(list);
        System.out.println(b);
    }
    public static void main1(String[] args) {
        List<Integer> list1=new ArrayList<>();
        list1.add(0);
        list1.add(123);
        list1.add(456);
        list1.add(444);
        list1.set(1,666666);
       // list1.remove(0);
        list1.add(46464646);
        System.out.println(list1);
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i)+" ");
        }
        System.out.println();
        for (int integer :list1 ) {
            System.out.print(integer+" ");
        }
        System.out.println();
        Iterator<Integer> it=list1.iterator();
        while(it.hasNext()) {
            int a=it.next();
            if(a==0) it.remove();
            System.out.print(a+" ");

        }
        System.out.println();
        ListIterator<Integer> lt2=list1.listIterator();
        while(lt2.hasNext()) {
            int a=lt2.next();
            if(a==444)
            {
                lt2.remove();
                lt2.add(9);
            }
            System.out.print(a+" ");
        }
        System.out.println(list1);
    }

}
