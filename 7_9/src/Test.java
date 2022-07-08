import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-07-09
 * Time: 0:19
 */
public class Test {
    public static void main(String[] args) {
        /*Stack<Integer> stack=new Stack<>();
        stack.push(6);
        stack.push(7);
       // System.out.println(stack.peek());
       // stack.pop();
        System.out.println(stack);
        Queue<Integer> queue=new LinkedList<>(stack);
        System.out.println(queue);

        queue.add(1);
        queue.offer(2);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);*/
        Deque<Integer> deque=new LinkedList<>();
        deque.offer(3);
        System.out.println(deque.size());
    }
}
