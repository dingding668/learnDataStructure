/*
 * TODO 类描述
 * @author QD
 * @date 2026/6/10 13:43
 */
import java.util.ArrayList;
import java.util.List;
public class PreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        //使用递归三部曲解决问题
        //1.确定递归函数的参数和返回值
        //需要一个辅助函数
        if(root == null) return res;

        pre(root,res);
        return res;
    }
    public void pre (TreeNode root,List<Integer> res){
        //2.确定终止条件
        if(root == null) return ;
        //3.确定单层逻辑
        res.add(root.val);
        pre(root.left,res);
        pre(root.right,res);
    }
}
