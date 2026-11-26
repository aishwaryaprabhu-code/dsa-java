class Treenode[
int val;
TreeNode left;
TreeNode right;

TreeNode(int val){
  this.val = val;
}

class SymmetricTree[
  public static boolean isSymmetric(Treeanode root){
  if(root == null){
  return true;
}
return isMirror(root.left, root.right);
}
static boolean isMirror(TreeNode a, TreeNode b){
  if(a== null && b == null){
    return true;

  }
  if(a == null || b == null){
    return false;
  }
  if(a.val != b.val){
    return false;
  }
  return isMirror(a.left, b.right) && isMirror(a.right, b.left);
}
public static void main(String[] args){
  TreeNode r1 = new TreeNode(1);
  r1.left = new TreeNode(2);
  r1.right = new TreeNode(2);
  r1.left.left = new TreeNode(3);
  r1.left.right = new TreeNode(4);
  r1.right.left = new TreeNode(4);
  r1.right.right = new TeeNode(3);
  // for assymetric
  TreeNode r2 = new TreeNode(1);
  r2.left = new Treeode(2);
  r2.right= new TreeNode(2);
  r2.left.right = new TreeNode(3);
  r2.right.right = new TreeNode(4);

  System.out.println(isSymmetric(r2));

}
//output
true
false
  
