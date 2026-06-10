/*
 * TODO 类描述
 * @author QD
 * @date 2026/6/10 17:14
 */

import java.util.ArrayList;
import java.util.List;

public class PostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postorder(root, res);
        return res;

    }
    //1.确定递归函数的参数和返回值
    public void postorder(TreeNode root, List<Integer> res){
        //2.确定终止条件
        if(root == null) return;
        //3.确定递归函数的单层逻辑
        postorder(root.left,res);
        postorder(root.right,res);
        res.add(root.val);
    }
}
