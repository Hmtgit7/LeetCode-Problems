import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(res, root);
        return res;
    }

    void dfs(List<Integer> res, TreeNode node) {
        if (node != null) {
            if (node.left != null) {
                dfs(res, node.left);
            }
            res.add(node.val);
            if (node.right != null) {
                dfs(res, node.right);
            }
        }
    }
}

public class BinaryTreeInorderTraversal94 {
    ArrayList<Integer> gfg = new ArrayList<Integer>() {
        {
            add(1);
            add(null);
            add(2);
            add(3);
        }
    };
    Solution s1=new Solution();

}