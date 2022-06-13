import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-06-13
 * Time: 10:04
 */
public class Demo1 {
    public static void main(String[] args) {
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
