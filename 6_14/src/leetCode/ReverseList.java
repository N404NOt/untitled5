package leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-06-14
 * Time: 15:31
 */
/*class Solution {
    public ListNode reverseList(ListNode head) {
        //新链表
        ListNode newHead = null;
        while (head != null) {
            //先保存访问的节点的下一个节点，保存起来
            //留着下一步访问的
            ListNode temp = head.next;
            //每次访问的原链表节点都会成为新链表的头结点，
            //其实就是把新链表挂到访问的原链表节点的
            //后面就行了
            head.next = newHead;
            //更新新链表
            newHead = head;
            //重新赋值，继续访问
            head = temp;
        }
        //返回新链表
        return newHead;
    }
}*/
class Solution {
    public ListNode reverseList(ListNode head) {
        //先判断这个链表如果是空或者长度是一直接返回
        if(head.next==null || head==null) {
            return head;
        }
        //创建一个新的链表
        ListNode newhead=null;
        while(head!=null) {
            //每次用node来接收节点
            ListNode node=head;
            //先保存head的next等下node的next赋值会找不到head的next
            ListNode n=head.next;
            //连接起来
            node.next=newhead;
            //新的链头
            newhead=node;
            //遍历head
            head=n;
        }
        return newhead;

    }
}
public class ReverseList {
    public static void main(String[] args) {
        Solution solution=new Solution();
        ListNode listNode1=new ListNode(1,null);
        ListNode listNode2=new ListNode(2,null);
        ListNode listNode3=new ListNode(3,null);
        ListNode listNode4=new ListNode(4,null);
        ListNode listNode5=new ListNode(5,null);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        listNode4.next=listNode5;
        ListNode t=null;
        t=solution.reverseList(listNode1);
        System.out.println(t);

    }
}

/*class Solution {
    public ListNode reverseList(ListNode head) {
        if(head.next==null || head==null) {
            return head;
        }
        ArrayList list=new ArrayList();
        ListNode t=head;

        while(t!=null) {
            list.add(t.val);
        }
        Collections.reverse(list);
        t=head;
        int i=0;
        while(t!=null) {
            t.val= (int) list.get(i++);
            t=t.next;
        }
        *//*ListIterator lt=list.listIterator();
        while(lt.hasNext()) {
            t.val=lt.next();
            t=t.next;
        }*//*
        return head;

    }
}*/
