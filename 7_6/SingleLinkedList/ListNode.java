/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-07-06
 * Time: 12:54
 */

public class ListNode {
      int val;
     ListNode next;
     ListNode() {

     }
     ListNode(int val) {
         this.val = val;
     }
      ListNode(int val, ListNode next) {
         this.val = val; this.next = next;
     }
  }
class Solution {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
        public ListNode middleNode(ListNode head) {
            ListNode slow=head;
            ListNode fast=head;
            while(fast.next != null) {
                slow=slow.next;
                fast=fast.next;
                if(fast.next != null) {
                    fast=fast.next;
                }

        }
            return slow;
    /*public ListNode removeElements(ListNode head, int val) {
        if(head == null) {
            return head;
        }
        if(head.val== val && head.next == null) {
            return null;
        }
        ListNode cur= head;
        while(cur.next != null) {
            if(cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;*/

    }
}
