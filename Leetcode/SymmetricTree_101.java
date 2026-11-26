class solution{
  public boolean isSymmetric(TreeNode root){
    if(root == null){
      return true;
    }

   return isMirror(root.left , root.right);
  }

 private boolean isMirrror(TreeNode a, TreeNode b){
   if(a == null && b == null){
     return true;
   }
   if(a== null || b== null){
     return false;
   }

   if(a.val =! b.val){
     return false;
   }
     return isMirror(a.left, b.right) && isMirror(a.right, b.left);
   }
 }

// complexities
O(n) - time.
O(h) - space -> h = height of tree.
