class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){}

    TreeNode(int val){
        this.val=val;
    }

    TreeNode(int val, TreeNode left, TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
}

public class Solution {

    public static boolean isValidBST(TreeNode root){
        return checkNode(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static boolean checkNode(TreeNode node, int min, int max){
        if(node==null) return true;

        if(node.val>min && node.val<max){
            return (checkNode(node.left,min,node.val) && checkNode(node.right, node.val, max));
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        TreeNode n3 = new TreeNode(3);
        TreeNode n6 = new TreeNode(6);
        TreeNode n4 = new TreeNode(4,n3,n6);
        TreeNode n1 = new TreeNode(1);
        TreeNode n5 = new TreeNode(5,n1,n4);

        boolean isValid = isValidBST(n5);
        System.out.println("The given BST is valid: "+isValid);
    }
}
