package LeetCode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-06-11
 * Time: 19:56
 */
//
class Solution2 {
    public String countAndSay(int n) {
        StringBuilder res = new StringBuilder("1");
        StringBuilder prev;
        int count;
        char key;
        for (int i = 1; i < n; i++) {
            prev = res;
            res = new StringBuilder();
            count=1;
            key = prev.charAt(0);
            for (int j = 1, len = prev.length(); j < len; j++) {
                if (key != prev.charAt(j)) {
                    res.append(count).append(key);
                    count = 1;
                    key = prev.charAt(j);
                } else {
                   count++;
                }
            }
           res.append(count).append(key);

        }
        return res.toString();
    }
}
public class Demo {
}
