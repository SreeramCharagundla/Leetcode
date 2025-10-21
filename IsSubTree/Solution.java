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
        this.left = left;
        this.right = right;
    }
}

public class Solution {

    static boolean equalityCheck(TreeNode p, TreeNode q){
        
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val != q.val) return false;
        boolean leftSame = equalityCheck(p.left, q.left);
        boolean rightSame = equalityCheck(p.right, q.right);

        return leftSame&&rightSame;

    }

    static boolean isSubtree(TreeNode root, TreeNode subRoot){
        
        if(subRoot == null) return true;
        if(root == null) return false;

        if(equalityCheck(root,subRoot)) return true;

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n4 = new TreeNode(4,n1,n2);
        TreeNode n5 = new TreeNode(5);
        TreeNode n3 = new TreeNode(3,n4,n5);

        TreeNode m1 = new TreeNode(1);
        TreeNode m2 = new TreeNode(2);
        TreeNode m4 = new TreeNode(4,m1,m2);

        boolean isSub = isSubtree(n3,m4);
        System.out.println("Tree2 is a Subtree of Tree1 :"+isSub);

    }
}
