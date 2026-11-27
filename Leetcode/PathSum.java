class solution{
  public boolean hasPath(TreeNode root, int targetSum){
    if(root == null){
      return false;
    }
    if(root.left == null && root.right == null){
      return root.val == targetSum;
    }
    int remaining = targetSum - root.val;

  return hasPathSum(root.left, remaining) || hasPathSum(root.right, remaining);
  }
}
// complexities
time- O(n)
  space - O(1)
