/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-07-02
 * Time: 11:40
 */
public class test {
    class Solution {
        public ListNode middleNode(ListNode head) {
            if(head==null) {
                return null;
            }
            if(head->next==null)
            {
                return head;
            }
            ListNode fast=head,slow=head;
            while(head!=null) {
                head=head.next.next;
                slow=slow.next;
            }
            return slow;

        }
    }
}
