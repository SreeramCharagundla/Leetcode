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
    
    static boolean isSame(TreeNode n1, TreeNode m1){

        if(n1==null && m1==null) return true;
        if(n1==null || m1==null) return false;

        if(n1.val!=m1.val) return false;

        boolean leftSame = isSame(n1.left,m1.left);
        boolean rightSame = isSame(n1.right,m1.right);

        return leftSame&&rightSame;

    }

    public static void main(String[] args) {
       TreeNode n1 = new TreeNode(1);
       TreeNode n2 = new TreeNode(2);
       TreeNode n3 = new TreeNode(3);
       
       TreeNode m1 = new TreeNode(1);
       TreeNode m2 = new TreeNode(2);
       TreeNode m3 = new TreeNode(3);

       n1.left = n2;
       n1.right = n3;

       m1.left = m2;
       m1.right = m3;

       System.out.println("Both trees are equal : "+ isSame(n1,m1));
    }
}
