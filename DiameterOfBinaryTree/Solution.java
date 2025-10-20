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
    static int diameter;
    
    static int diameterOfBinaryTree(TreeNode root){
        diameter = 0;
        longestPath(root);
        return diameter;
    }

    static int longestPath(TreeNode node){
        
        if(node==null) return -1;

        int leftPath = longestPath(node.left);
        int rightPath = longestPath(node.right);

        diameter = Math.max(diameter,leftPath+rightPath+2);

        return Math.max(leftPath,rightPath)+1;
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        

        int diameter = diameterOfBinaryTree(n1);
        System.out.println("Longest Diameter = "+diameter);
    }
}
