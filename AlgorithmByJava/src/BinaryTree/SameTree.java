package BinaryTree;

/**
 * @author Peiran Li
 */
public class SameTree {
  public static class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
  }

  public static boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null ^ p == null) {
      return false;
    }

    if (p == null && q == null) {
      return true;
    }

    return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right
        , q.right);
  }
}
