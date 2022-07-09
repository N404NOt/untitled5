package LeetNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class MinStack {
   /* Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack=new Stack<>();
        minStack=new Stack<>();
        minStack.add(Integer.MAX_VALUE);

    }
    
    public void push(int val) {
        stack.push(val);
        int min=Math.min(minStack.peek(),val);
        if(minStack.peek()==min) {
            return;
        } else{
            minStack.push(min);
        }

    }
    
    public void pop() {
        stack.pop();
        int min=minStack.peek();
        if(stack.peek()==min) {
            minStack.pop();
        }

    }
    
    public int top() {
       return stack.peek();

    }
    
    public int getMin() {
        return minStack.peek();

    }*/

/*
class MyStack {
    Deque<Integer> deque;

    public MyStack() {
        deque=new LinkedList<>();

    }

    public void push(int x) {
        deque.offer(x);
        int size=deque.size()-1;
        for (int i = 0; i < size; i++) {
            deque.offer(deque.poll());
        }

    }

    public int pop() {
        return deque.pop();

    }

    public int top() {
        return deque.peek();


    }

    public boolean empty() {
        return deque.isEmpty();

    }
}
*/
/*
class MyStack {
    Queue<Integer> n1;
    Queue<Integer> n2;

    public MyStack() {
        n1=new LinkedList<>();
        n2=new LinkedList<>();

    }

    public void push(int x) {
        n1.offer(x);
        int size=n2.size();
        for (int i = 0; i < size; i++) {
            n1.offer(n2.poll());
        }
        n2=n1;
        n1=null;

    }

    public int pop() {
        return n2.pop();

    }

    public int top() {
        return n2.peek();

    }

    public boolean empty() {
        return n2.isEmpty();

    }
}*/
public static void main(String[] args) {
    MyCircularQueue myCircularQueue=new MyCircularQueue(5);
    myCircularQueue.enQueue(3);
    myCircularQueue.enQueue(1);
    myCircularQueue.enQueue(2);
    myCircularQueue.enQueue(3);
    myCircularQueue.enQueue(4);
    System.out.println(myCircularQueue.end);
    System.out.println(myCircularQueue.Rear());
    myCircularQueue.deQueue();
    System.out.println(myCircularQueue.Rear());
}
}
class MyCircularQueue {
    int pre;
    int end;
    int[] arr;


    public MyCircularQueue(int k) {
        arr=new int[k+1];
        pre=0;
        end=0;

    }

    public boolean enQueue(int value) {
        if(isFull()) {
            return false;
        }
        arr[pre]=value;
        pre=(pre+1)%arr.length;
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()) {
            return false;
        }
        end=(end+1)%arr.length;
        return true;


    }

    public int Front() {
        if(isEmpty()) {
            return -1;
        }
        return arr[pre-1];

    }

    public int Rear() {
        if(isEmpty()) {
            return -1;
        }
        int index=(end==0) ? arr.length-1:end-1;
        return

    }

    public boolean isEmpty() {
        if(end == pre) {
            return true;
        }
        return false;

    }

    public boolean isFull() {
        if(end == (pre+1)%arr.length) {
            return true;
        }
        return false;
    }
}