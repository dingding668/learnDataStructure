/*
 * TODO 类描述
 * @author QD
 * @date 2026/6/11 15:54
 */

public class MaxDepth {
    //本题，二叉树的高度就是左右子树当中较高的那一方加一层就是当前节点的高度
    //1.确定递归函数的参数和返回值，参数就是节点，返回值是目前的高度
    public int maxDepth(TreeNode root) {
        //2.确定递归终止条件
        if(root == null) return 0;
        //3.确定单层逻辑
        int leftDepth = maxDepth(root.left);

        int rightDepth = maxDepth(root.right);

        return Math.max(leftDepth, rightDepth) + 1 ;

    }
}
