/*
 * TODO 类描述
 * @author QD
 * @date 2026/6/10 14:58
 */

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root,res);
        return res;
    }
    //1.确定递归函数的参数和返回值
    public void inorder(TreeNode root, List<Integer> res){
        //2.确定递归的终止条件
        if(root == null) return;
        //3.确定递归函数的单层逻辑
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);
    }
}
