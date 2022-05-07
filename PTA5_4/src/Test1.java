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
    public static void isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char c='0';
        for (char ch : s.toCharArray()) {
            c=ch;
            if(ch=='.'){
                break;
            }
            if (ch == '(') {
                stack.push(')');
                continue;
            } else if (ch == '[') {
                stack.push(']');
                continue;
            } else if (ch == '/') {
                stack.push('*/');
                continue;
            }else if (ch == '{') {
                stack.push('}');
                continue;
            } else if (stack.empty()) {
                System.out.println("No");
                if(ch==')'||ch=='}'||ch==']'){
                    System.out.println("?-"+ch);
                    return;
                }else if(stack.pop() != ch){
                    System.out.println("No");
                    System.out.println(c+"-?");
                    return;
                }
            }
        }
        if (!stack.empty()) {
            System.out.println("No");
                System.out.println(c+"-?");
                return;
            }
        System.out.println("Yes");
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        isValid(s);
    }
}



