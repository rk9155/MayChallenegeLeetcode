package Week3;

public class KthSmallestInBST {
	
	public class TreeNode {
		     int val;
		     TreeNode left;
		     TreeNode right;
		     TreeNode() {}
		    TreeNode(int val) { this.val = val; }
		     TreeNode(int val, TreeNode left, TreeNode right) {
		         this.val = val;
		         this.left = left;
		         this.right = right;
		     }
		 }
		  
		public static int ans = 0;
		public int kthSmallest(TreeNode root, int k) {
		    helper(root, k);
		    return ans;
		}

		public int helper(TreeNode root, int k) {
		    if (root == null) {
		        return 0;
		    }
		    int leftC = helper(root.left, k);
		    int rightC = helper(root.right, k - leftC - 1);
		    if (k == leftC + 1) {
		        ans = root.val;
		    }
		    return leftC + rightC + 1;
		}
		}