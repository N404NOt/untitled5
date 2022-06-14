package leetCode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-06-14
 * Time: 15:19
 */
public class Solutiom2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast=head;
        ListNode low=head;
        while(n--!=0) {
            fast=fast.next;
        }
        if(fast==null) {
            return head.next;
        }
        while(fast.next!=null) {
            fast=fast.next;
            low=low.next;
        }
        low.next=low.next.next;
        return null;
    }
}
