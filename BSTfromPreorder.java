package Week4;

public class BSTfromPreorder {
	
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
	    public TreeNode bstFromPreorder(int[] preorder) {
			return helper(preorder,0,preorder.length-1);
		}

	public TreeNode helper(int [] pre, int left, int right){
	    if(left > right) return null;
	    TreeNode root = new TreeNode(pre[left]);
	    int mid = left+1;
	    while(mid<pre.length && pre[mid]<pre[left] ){
	        mid++;
	    }
	    root.left = helper(pre,left+1,mid-1);
	    root.right =helper(pre,mid,right);
	    return root;
	}
	}

