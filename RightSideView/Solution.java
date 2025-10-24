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

    public static List<Integer> rightSideView(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if(root==null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int level = queue.size();
            for(int i=0;i<level;i++){
                TreeNode current = queue.poll();
                if(current.left!=null) queue.add(current.left);
                if(current.right!=null) queue.add(current.right);
                if(i==level-1){
                    result.add(current.val);
                }
            }
            
        }

        return result;

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
        n4.left = n5;

        List<Integer> res = rightSideView(n1);
        System.out.println("Visisble nodes are");
        System.out.println();
        for(int r:res){
            System.out.print(r+" ");
        }

    }
}
