import java.util.*;

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

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int size = queue.size();

            for(int i=0;i<size;i++){
                TreeNode current = queue.poll();
                level.add(current.val);

                if(current.left!=null) queue.add(current.left);
                if(current.right!=null) queue.add(current.right);
            }
            result.add(level);
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n2 = new TreeNode(2,n4,n5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        TreeNode n3 = new TreeNode(3,n6,n7);
        TreeNode n1 = new TreeNode(1,n2,n3);

        List<List<Integer>> ans = levelOrder(n1);

        printList(ans);

    }

    public static void printList(List<List<Integer>> list){
        System.out.println("level order traversal:");

        for(List<Integer> level:list){
            System.out.println(level);
        }
    }
}
