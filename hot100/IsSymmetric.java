/*
 * TODO 类描述
 * @author QD
 * @date 2026/6/22 17:21
 */

public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        return check(root.left,root.right);
    }
    //1.确定递归函数的参数和返回值,
    // 参数：左右两个节点
    // 返回值：这两棵树是否镜像对称
    public boolean check(TreeNode left, TreeNode right){
        //2.确定递归函数的终止条件,终止条件有点儿多
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.val != right.val) return false;


        //3.确定递归函数的单层逻辑
        return check(left.left, right.right) && check(left.right, right.left);
    }
}
