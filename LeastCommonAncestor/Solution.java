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
        this.left = left;
        this.right = right;
    }
}

public class Solution {

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        int pval = p.val, qval = q.val;

        while(root!=null){
            if(pval<root.val && qval<root.val){
                root=root.left;
            }else if(pval>root.val && qval>root.val){
                root=root.right;
            }else{
                return root;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TreeNode n3 = new TreeNode(3);
        TreeNode n5 = new TreeNode(5);
        TreeNode n4 = new TreeNode(4,n3,n5);
        TreeNode n0 = new TreeNode(0);
        TreeNode n2 = new TreeNode(2,n0, n4);
        TreeNode n7 = new TreeNode(7);
        TreeNode n9 = new TreeNode(9);
        TreeNode n8 = new TreeNode(8,n7,n9);
        TreeNode n6 = new TreeNode(6,n2,n8);

        TreeNode ans = lowestCommonAncestor(n6,n2,n8);
        System.out.println("value of the LCA (Least Common Ancestor): "+ans.val);
    }    
}
