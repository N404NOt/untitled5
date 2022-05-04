import javax.swing.*;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-04
 * Time: 12:12
 */
public class Test1 {
    public static boolean isValid(String s) {
        if (s.length() == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(')');
            } else if (ch == '[') {
                stack.push(']');
            } else if (ch == '{') {
                stack.push('}');
            } else if (stack.empty() || stack.pop() != ch) {
                return false;
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s;
        s=scanner.next();
        boolean a=isValid(s);
        if(a==false){
            System.out.println("false");
        }else{
            System.out.println("true");
        }

    }
}


