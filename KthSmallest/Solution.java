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

class Solution{

    public static int kthSmallest(TreeNode root, int k){
        ArrayList<Integer> nums = inOrder(root, new ArrayList<Integer>());
        return nums.get(k-1);
    }

    public static ArrayList<Integer> inOrder(TreeNode node, ArrayList<Integer> arr){
        if(node==null) return arr;

        inOrder(node.left,arr);
        arr.add(node.val);
        inOrder(node.right,arr);

        return arr;
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        n2.left = n1;
        TreeNode n3 = new TreeNode(3);
        n3.left = n2;
        TreeNode n4 = new TreeNode(4);
        n3.right = n4;
        TreeNode n6 = new TreeNode(6);
        TreeNode n5 = new TreeNode(5,n3,n6);

        int k=3;
        int ans = kthSmallest(n5,k);
        System.out.println(k+"th smallest number in this tree is:" +ans);
    }
}