/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-07-11
 * Time: 9:36
 */
public class BinaryTree1 {
    static class TreeNode {
        public char val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(char val) {
            this.val = val;
        }
    }
        public TreeNode root;
    public void createTree() {
        TreeNode A = new TreeNode('A');
        TreeNode B = new TreeNode('B');
        TreeNode C = new TreeNode('C');
        TreeNode D = new TreeNode('D');
        TreeNode E = new TreeNode('E');
        TreeNode F = new TreeNode('F');
        TreeNode G = new TreeNode('G');
        TreeNode H = new TreeNode('H');

        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.left = F;
        C.right = G;
        E.right = H;
        this.root = A;
    }
    int size(TreeNode root) {
        if(root ==null) {
            return 0;
        }
        return 1+root.left+root.right;
    }

    //遍历思路：只要遍历到了节点 就nodeSize ++
    public static int nodeSize;
    void size2(TreeNode root) {
        if( root == null) {
            return;
        }
        nodeSize++;
        size2(root.left);
        size2(root.right);

    }
    //子问题 获取叶子节点的个数
    int getLeafNodeCount(TreeNode root) {
        if(root ==null) {
            return 0;
        }
        if(root.left ==null &&root.right ==null) {
            return 1;
        }
        return getLeafNodeCount2(root.left)+getLeafNodeCount2(root.right);
    }

    //遍历思路
    public static int leafSize;
    int getLeafNodeCount2(TreeNode root) {
        if(root.left ==null && root.right==null) {
            return leafSize++;
        }
        getLeafNodeCount2(root.left);
        getLeafNodeCount2(root.right);
        return leafSize;
    }
    // 获取二叉树的高度
    int getHeight(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return Math.max(getHeight(root.left),getHeight(root.right))+1;

    }
}
