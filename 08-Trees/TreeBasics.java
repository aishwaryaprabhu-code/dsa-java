class TreeNode{
  int val;
  TreeNode left;
  TreeNode right;

TreeNode (int val){
  this.val = val;
}

class TreeBasics{
  static void preorder(TreeNode){
    if(node == nul){
      return;
    }
    System.out.println(node.val + " " );
    preorder(node.left);
    preorder(node.right);
  }

  static void inorder(TreeNode){
    if(node == null){
      return;
    }
   inorder(node.left);
  System.out.println(node.val + " " );
    inorder(node.right);
  }
  static void postorder(TreeNode){
    if(node == null){
      return;
    }
    postorder(node.left);
    postorder(node.right);
    System.out.println(node.val + " ");

  }

  public static void main(String[] args){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right  = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);

    preorder(root);
    System.out.println();
    inorder(root);
    System.out.println();
    postorder(root);
  }
  //output
1 2 4 5 3
4 2 5 1 3
4 5 2 3 1

  // complexities
O(1) → Constant time (one operation).
O(log n) → Tree height-based search in a balanced BST.
O(n) → Visiting all nodes.

    
  
