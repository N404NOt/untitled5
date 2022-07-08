import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-07-07
 * Time: 13:35
 */
public class Demo2 {
    public class PalindromeList {
        class Solution {
            public boolean isValid(String s) {
                Stack<Character>stack=new Stack<>();
                for (char c: s.toCharArray()) {
                    if(c=='{' || c== '[' || c== '(') {
                        stack.push(c);
                    } else {
                        if()
                    }
                }

            }
        }
    }
      /*  public class Partition {
            public ListNode partition(ListNode pHead, int x) {
                // write code here
                ListNode pre=null;
                ListNode bhd=null;
                ListNode cur=pHead;
                while(cur != null) {
                    if(cur.val == x) {
                        pre.next=cur;
                    } else {
                        bhd.next=cur;
                    }
                    if(cur.next ==null) {
                        if(cur.val==x) {

                        }
                    }
                }
            }
        }
    }*/
        /*public boolean chkPalindrome(ListNode A) {
            if(A.next==null) {
                return true;
            }
            if(A==null) {
                return false;
            }
            // write code here
            ListNode slow=A;
            ListNode fast=A;
            while(fast.next!=null) {
                fast= fast.next;
                if(fast.next!=null) {
                    fast=fast.next;
                } else {
                    return false;
                }
                slow=slow.next;
            }
            ListNode tmp=reverse(slow);
            ListNode head=A;
            while(tmp!=null) {
                if(tmp.val != head.val) {
                    return false;
                }
                tmp=tmp.next;
                head=head.next;
            }
            return true;
        }
    }
    public ListNode reverse(ListNode slow) {
        ListNode n0=null;
        ListNode n1=slow;
        ListNode n2=n1.next;
        while(n1 != null) {
            n1.next=n0;
            n0=n1;
            n1=n2;
            n2=n1.next;
        }
        return n0;
    }*/
}
