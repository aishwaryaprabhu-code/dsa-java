class TreeNode{
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int val){
    this.val =  val;
  }
  class Same_Tree{
    public static boolean isSameTree(TreeNode p, Treenode q){
      if(p == null && q == null){
        return true;
      }
      if(p == null || q == null){
        return false;
      }

      if(p.val != q.val){
        return false;
      }

      return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args){
      //for same shapeand values
      TreeNode p1 = new TreeNode(1);
      p1.left = new TreeNode(2);
      p1.right = new TreeNode(3);

      TreeNode q1 = new TreeNode(1);
      q1.left = new TreeNode(2);
      q2.right = new TreeNode(3);

      System.out,println(isSameTree(p1, q1));

      // Case 2: different shape 
        TreeNode p2 = new TreeNode(1);
        p2.left = new TreeNode(2);

        TreeNode q2 = new TreeNode(1);
        q2.right = new TreeNode(2);

        System.out.println(isSameTree(p2, q2));

        // Case 3: same shape, different values
        TreeNode p3 = new TreeNode(1);
        p3.left = new TreeNode(2);
        p3.right = new TreeNode(1);

        TreeNode q3 = new TreeNode(1);
        q3.left = new TreeNode(1);
        q3.right = new TreeNode(2);

        System.out.println(isSameTree(p3, q3));
    }
}

//output
  true
  false
  false
// complexities
  time - O(n)
  space -O(h) - height of tree.
        
      
