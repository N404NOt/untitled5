import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-07-06
 * Time: 15:31
 */

public class Demo {
    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        if(head == null) {
            return false;
        }
        while(fast != null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow ==fast) {
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int a=5;
        System.out.println(a);
        System.out.println("a:" + a);
        Scanner scanner =new Scanner(System.in);
        int b=scanner.nextInt();
        System.out.println(b);

    }


}
