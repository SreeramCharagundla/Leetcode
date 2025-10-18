class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){}

    TreeNode(int val){
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
}

public class Solution {

    static int maxDepth(TreeNode root){
        if(root==null){
            return 0;        
        }else{ 
            int left_height = maxDepth(root.left);
            int right_height = maxDepth(root.right);

            return java.lang.Math.max(left_height,right_height)+1;
        }
    }

    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20,new TreeNode(15),new TreeNode(7));

        int depth = maxDepth(root);
        System.out.println("Max Depth of the Binary Tree is "+depth);
    }    
}
