/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-07-14
 * Time: 19:04
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val) {
        this.val = val;
    }
}
public class Demo1 {
    public boolean samTree(TreeNode root,TreeNode q) {
        if(root == null && q != null || root != null && q == null) {
            return false;
        }
        if(root.val != q.val) {
            return false;
        }
        return samTree(root.left,q.left) && samTree(root.right,q.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null ) {
            return false;
        }
        if(root.val == subRoot.val ) {
            samTree(root,subRoot);
        }
        return isSubtree(root.left,subRoot.left) || isSubtree(root.right,subRoot.right);
    }
}
class Solution {
    // 这个就是LeetCode100 题的那个函数
    public boolean isSameTree(TreeNode s,TreeNode t){
        // 同时为空 说明树一起到底，两树相同
        if (s==null && t == null){
            return true;
        }
        // 如果上面没有返回值，说明必有一个没有为空（有可能两个都不为空）
        if (s == null || t == null){
            return false;
        }
        // 如果判断到了这一步，说明两个都不为空
        // 先序遍历 自己--左 -- 右
        if (s.val != t.val){
            return false;
        }
        return isSameTree(s.left,t.left) && isSameTree(s.right,t.right);
    }
    public boolean isSubtree(TreeNode s, TreeNode t) {
        // 我s都遍历完了。你居然还没匹配上。那就返回false
        if (s==null){
            return false;
        }
        // 短路运算符，有一个为真，返回真
        return isSameTree(s,t) || isSubtree(s.left,t) || isSubtree(s.right,t);
    }
}
class Solution1 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        return isSymmetricChild(root.left,root.right);
    }

    private boolean isSymmetricChild(TreeNode leftTree,TreeNode rightTree) {
        if(leftTree == null && rightTree != null || leftTree != null && rightTree == null) {
            return false;
        }
        if(leftTree == null && rightTree == null) {
            return true;
        }
        if(leftTree.val != rightTree.val) {
            return false;
        }
        return  isSymmetricChild(leftTree.left,rightTree.right) && isSymmetricChild(leftTree.right,rightTree.left);

    }
}
