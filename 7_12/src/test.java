/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-07-12
 * Time: 9:43
 */
 class TreeNode {
      int val;
      treeNode left;
      treeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, treeNode left, treeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class test {
    public boolean isSameTree(treeNode p, treeNode q) {
        if(p == null && q != null || p != null && q == null) {

            return false;
        }
        if(p == null && q == null) {
            return true;
        }
        if(p.val != q.val) {
            return false;
        }
//p != null && q != null && p.val == q.val
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
    public boolean isSubtree(treeNode root, treeNode subRoot) {
        if(root == null || subRoot == null) {
            return false;
        }
        if(root.val == subRoot.val) {
            return isSameTree(root,subRoot);
        }
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);

    }
    public int maxDepth(treeNode root) {
        if(root == null) return 0;
        int leftTree = maxDepth(root.left);
        int rightTree = maxDepth(root.right);
        return (leftTree >  rightTree?
                leftTree+1 : rightTree +1);
    }
    public boolean isBalanced(treeNode root) {
        if(root ==null) {
            return true;
        }
        int leftDepth=maxDepth(root.left);
        int rightDepth=maxDepth(root.right);
        if(Math.abs(leftDepth - rightDepth) <=1) {
            return true && isBalanced(root.left) && isBalanced(root.right);
        }
        return false;
    }
    public boolean isSymmetric(treeNode root) {
        if(root == null) {
            return true;
        }
        return isSymmetricChild(root.left,root.right);
    }

    private boolean isSymmetricChild(treeNode leftTree, treeNode rightTree) {
        if(leftTree == null && rightTree != null || leftTree != null && rightTree == null) {
            return false;
        }
        if(leftTree == null && rightTree == null) {
            return true;
        }
        if(leftTree.val != rightTree.val) {
            return false;
        }
        return true && isSymmetricChild(leftTree.left,rightTree.right) && isSymmetricChild(leftTree.right,rightTree.left);

    }
}
