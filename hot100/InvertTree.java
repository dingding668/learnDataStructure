/*
 * TODO 类描述
 * @author QD
 * @date 2026/6/11 17:27
 */

public class InvertTree {
    public TreeNode invertTree(TreeNode root) {

        exchange(root);
        //发现我好像并不需要这个函数的返回值，所以我决定引入一个辅助函数
        return root;
    }

    public void exchange(TreeNode root){
        //1.确定递归函数的参数和返回值，参数是当前节点，返回值是void
        //2.确定递归终止条件
        if(root == null) return;
        //.3.确定单层逻辑，交换两个孩子节点,使用的是前序遍历

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        exchange(root.left);
        exchange(root.right);
    }
}
