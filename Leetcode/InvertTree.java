class solution{
  public TreeNode invertTree(TreeNode root){
    if(root == null){
      return null;
    }

  TreeNode temp = root.left;
    root.left = root.right;
    root.right = temp;

  invertTree(root.left);
    invertTree(root.right);

  }
}
// complexities
O(n) - time
O(h) - space - height of tree h
