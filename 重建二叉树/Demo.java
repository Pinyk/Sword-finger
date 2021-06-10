package 剑指offer.重建二叉树;

import java.util.HashMap;
/**
 * @Author: gaoyk
 * @Date: 2021/6/6 16:27
 */

 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

public class Demo {

    static int[] preorders;
    static HashMap<Integer, Integer> dic = new HashMap<>();

    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        TreeNode head = buildTree(preorder, inorder);
        printTree(head);
    }

    private static void printTree(TreeNode head) {
        if (head == null)
            return;
        System.out.print(head.val + " ");
        printTree(head.left);
        printTree(head.right);
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        preorders = preorder;
        for(int i = 0; i < inorder.length; i++)
            dic.put(inorder[i], i);
        return recur(0, 0, inorder.length - 1);
    }
    public static TreeNode recur(int root, int left, int right) {
        if(left > right)
            return null;                        // 递归终止
        TreeNode node = new TreeNode(preorders[root]);        // 建立根节点
        int i = dic.get(preorders[root]);                    // 划分根节点、左子树、右子树
        //此时左子树的根就是左子树的(前序遍历）第一个，就是+1,
        // 左边边界就是left，右边边界是中间区分的i-1
        node.left = recur(root + 1, left, i - 1);     // 开启左子树递归

        //右子树的根，就是右子树（前序遍历）的第一个,就是当前根节点 加上左子树的数量
        //根节点索引(root) + 左子树长度(i - left) + 1
        node.right = recur(root + i - left + 1, i + 1, right); // 开启右子树递归
        return node;                                           // 回溯返回根节点
    }
}
