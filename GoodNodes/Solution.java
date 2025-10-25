import java.util.*;

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

    private static int num = 0;

    public static int goodNodes(TreeNode root){
        dfs(root, Integer.MIN_VALUE);
        return num;
    }

    public static void dfs(TreeNode node, int max){
        if(max<=node.val){
            num++;
        }
        if(node.right!=null){
            dfs(node.right, Math.max(max,node.val));
        }
        if(node.left!=null){
            dfs(node.left, Math.max(max,node.val));
        }
    }

    public static void main(String[] args) {
        TreeNode n3 = new TreeNode(3);
        TreeNode n1 = new TreeNode(1);
        TreeNode n4 = new TreeNode(4);
        n3.left = n1;
        n3.right = n4;
        TreeNode n11 = new TreeNode(1);
        TreeNode n5 = new TreeNode(5);
        n4.left = n11;
        n4.right = n5;
        TreeNode n33 = new TreeNode(3);
        n1.left = n33;

        int ans = goodNodes(n3);
        System.out.println("No of good nodes in this tree are: "+ans);
    }
}
