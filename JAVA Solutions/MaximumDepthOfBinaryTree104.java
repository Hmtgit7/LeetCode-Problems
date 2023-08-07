public class MaximumDepthOfBinaryTree104 {
    public static void main(String[] args) {
        MaximumDepthOfBinaryTree104 s = new MaximumDepthOfBinaryTree104();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.left.left = new TreeNode(15);
        root.left.right = new TreeNode(7);
        root.right = new TreeNode(20);
        System.out.println(s.maxDepth(root));
    }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int leftDepth = 1 + maxDepth(root.left);
        int rightDepth = 1 + maxDepth(root.right);
        return Math.max(leftDepth, rightDepth);
    }
}