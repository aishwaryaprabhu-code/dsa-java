class TreeNode{
  int val;
  TreeNode left;
  TreeNode right;

TreeNode(int val){
  this.val=val;
}
class InvertTree{
  static TreeNode invertTree(TreeNode root){
    if(root == null){
      return null;
    }
    TreeNode temp = root.left;
    root.left = root.right;
    root.right = temp;

  invertTree(root.left);
    invertTree(root.right);

  return root;
  }

  static void inorder(TreeNode node){
    if(node =null)[
    return;
  }
inorder(node.left);
System.out.println(node.val + " " );
inorder(node.right);
}

public static void main(String[] args){
  TreeNode root = new TreeNode(4);
  root.left = new TreeNode(2);
  root.right = new TreeNode(7);
  root.left.left = new TreeNode(1);
  root.left.right = new TreeNode(3);
  root.right.left = new TreeNode(6);
  root.right.right= new TreeNode(9);

  inorder(root);
  system.out.println();

  invertTree(root);

  inorder(root);

}
}

// output
1 2 3 4 6 7 9
9 7 6 4 3 2 1
  

