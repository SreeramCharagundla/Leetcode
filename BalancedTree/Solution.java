class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){}

    TreeNode(int val){
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {

    static final int FAIL = -2;
    
    public static boolean isBalanced(TreeNode root){        
        return heightOrFail(root) != FAIL;
    }

    public static int heightOrFail(TreeNode node){
        if(node==null) return -1;

        int leftHeight = heightOrFail(node.left);
        if(leftHeight==FAIL) return FAIL;

        int rightHeight = heightOrFail(node.right);
        if(rightHeight==FAIL) return FAIL;

        if(Math.abs(leftHeight-rightHeight)>1){
            return FAIL;
        }

        return Math.max(leftHeight,rightHeight)+1;
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;

        Boolean ans = isBalanced(n1);
        System.out.println("The tree is balanced: "+ans);
    }
}
