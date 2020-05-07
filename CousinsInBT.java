package Week1;

import javax.swing.tree.TreeNode;

public class CousinsInBT {
	  
static class Node  
	{  
	    int val;  
	    Node left;  
	    Node right;  
	};  

static Node createNode(int val)  
	{  
	    Node node;  
	    node = new Node();  
	    node.val = val;  
	    node.left = null;  
	    node.right = null;  
	    return node;  
	}  

static Node p1 = null;
static Node p2 = null;
public static boolean isCousins(Node root, int x, int y) {
    int d1 = helper(root,x,null,0);
    int d2 = helper(root,y,null,0);
    return (d1==d2) && (p1 != p2);
}
private static int helper(Node node, int val, Node parent, int depth){
    if(node== null) return 0;
    if(node.val == val){
        if(p1 == null) p1 = parent;
        else p2 = parent;
        return depth;
    }
    int dl = 0; //  depth if val in left subtree
    int dr = 0; //  depth if val in right subtee

    dl =helper(node.left, val, node, depth+1);
    if(dl != 0) return dl;
    dr =helper(node.right, val, node, depth+1);
    return dr;
}
public static void main(String[] args) {
		Node root; 
	    root = createNode(1);  
	    root.left = createNode(2);  
	    root.right = createNode(4);  
	    root.left.left = createNode(3);  
	    root.left.right = createNode(-1);  
	    root.right.left = createNode(5);  
	    root.right.right = createNode(-1); 
	    int x = 5;
	    int y = 4;
	    System.out.println(isCousins(root,x,y));
		
	}

}
