class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return 1 + Math.max(leftDepth, rightDepth);
    }
}

//output
3
// complexities

Time Complexity: O(n)
Space Complexity: O(h)

Best/Average case (balanced): O(log n) space
Worst case (skewed): O(n) space
