/*
 * TODO 类描述
 * @author QD
 * @date 2026/6/11 16:50
 */

public class IsSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //1.确定递归函数的参数和返回值，递归函数的参数是两颗二叉树相同位置的节点，返回值是他们是否一样
        //2.递归函数的终止条件
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;

        // 3. 确定单层递归逻辑
        boolean left = isSameTree(p.left, q.left);
        boolean right = isSameTree(p.right, q.right);

        return left && right;


    }
}
