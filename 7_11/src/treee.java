import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-07-11
 * Time: 16:19
 */
public class BinaryTree {

    static class TreeNode {
        public char val;
        public TreeNode left;//左孩子的引用
        public TreeNode right;//右孩子的引用

        public TreeNode(char val) {
            this.val = val;
        }
    }
    public TreeNode node;


    /**
     * 创建一棵二叉树 返回这棵树的根节点
     *
     * @return
     */
    public TreeNode createTree() {
        TreeNode A = new TreeNode('A');
        TreeNode B = new TreeNode('B');
        TreeNode C = new TreeNode('C');
        TreeNode D = new TreeNode('D');
        TreeNode E = new TreeNode('E');
        TreeNode F = new TreeNode('F');
        A.left=B;
        B.right=C;
        B.left = D;
        B.right = E;
        C.right = F;
        this.node=A;
        return A;
    }

    // 前序遍历
    public void preOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // 中序遍历
    void inOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        preOrder(root.left);
        System.out.print(root.val+" ");
        preOrder(root.right);
    }

    // 后序遍历
    void postOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.val+" ");
    }

    public static int nodeSize;

    /**
     * 获取树中节点的个数：遍历思路
     */
    void size(TreeNode root) {
        if(root == null) {
            return;
        }
        nodeSize++;
        size(root.left);
        size(root.right);
    }

    /**
     * 获取节点的个数：子问题的思路
     *
     * @param root
     * @return
     */
    int size2(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return size2(root.left)+size2(root.right);
    }


    /*
     获取叶子节点的个数：遍历思路
     */
    public static int leafSize = 0;

    void getLeafNodeCount1(TreeNode root) {
        if(root == null) {
            return;
        }
        if(root.left ==null && root.right == null) {
            leafSize++;
        }
        getLeafNodeCount1(root.left);
        getLeafNodeCount1(root.right);
    }

    /*
     获取叶子节点的个数：子问题
     */
    int getLeafNodeCount2(TreeNode root) {
        if(root == null) {
            return 0;
        }
        if(root.left ==null && root.right == null) {
            return 1;
        }
        return getLeafNodeCount2(root.left)+getLeafNodeCount2(root.right);
    }

    /*
    获取第K层节点的个数
     */
    int getKLevelNodeCount(TreeNode root, int k) {
        if(k == 1) {
            return 1;
        }
        return getKLevelNodeCount(root.left,k-1)+getKLevelNodeCount(root.right,k-1);
    }

    /*
     获取二叉树的高度
     时间复杂度：O(N)
     */
    int getHeight(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return Math.max(getHeight(root.left),getHeight(root.right))+1;

    }


    // 检测值为value的元素是否存在
    TreeNode find(TreeNode root, char val) {
        if(root == null) {
            return null;
        }
        if(root.val == val) {
            return root;
        }
        TreeNode find = find(root.left,val);
        if(find != null) {
            return find;
        }
        find = find(root.right,val);
        if(find != null) {
            return find;
        }


        return null;
    }

    //层序遍历
    void levelOrder(TreeNode root) {
        Queue<TreeNode> queue =new LinkedList<>();
        TreeNode tmp=root;
        queue.offer(tmp);
        while(!queue.isEmpty()) {
            tmp=queue.poll();
            System.out.println(tmp.val);
            if(tmp != null) {
                if(tmp.left != null) {
                    queue.offer(tmp.left);
                }
                if(tmp.right != null) {
                    queue.offer(tmp.right);
                }
            }
        }

    }


    // 判断一棵树是不是完全二叉树
    boolean isCompleteTree(TreeNode root) {
        if(root.left == null && root.right != null) {
            return false;
        }
        if(root == null) {
            return true;
        }
        return isCompleteTree(root.left) && isCompleteTree(root.right);
    }
}