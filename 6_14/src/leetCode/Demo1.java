package leetCode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-06-14
 * Time: 15:03
 */
class Solution1 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre=head;
        int length=length(head)-n;
        if(length==0) {
            return null;
        }
        for (int i = 0; i < length-1; i++) {
            pre=pre.next;
        }
        pre.next=pre.next.next;
        return head;

    }
    public int length(ListNode head) {
        ListNode pre=head;
        int length=0;
        while(pre!=null) {
            length++;
            pre=pre.next;
        }
        return length;
    }
}
public class Demo1 {
}
