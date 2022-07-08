/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-07-07
 * Time: 16:06
 */
import java.util.*;
import java.util.ArrayList;

public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack=new Stack<>();
        int i=0;
        int n=pushA.length;
        for (int j = 0; j < n; j++) {
            if(pushA[j] != popA[i]) {
                stack.push(pushA[j]);
                i++;
            } else {
                if(stack.peek()==popA[i]) {
                    stack.pop();
                    i++;
                } else {
                    return false;
                }
            }
        }
        if(stack.empty()) {
            return true;
        }
        return false;

    }
}
public class Test {
}
