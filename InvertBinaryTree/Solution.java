
//  Definition for a binary tree node.

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
 
class Solution {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        
        root.right = left;
        root.left = right;

        return root;
    }

    public static void printTree(TreeNode root) {
        if (root == null) {
            System.out.println("[]");
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<String> result = new ArrayList<>();

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                result.add("null");
                continue;
            }
            result.add(String.valueOf(node.val));
            queue.offer(node.left);
            queue.offer(node.right);
        }

        // Trim trailing "null"s for clean output
        int last = result.size() - 1;
        while (last >= 0 && result.get(last).equals("null")) {
            last--;
        }

        System.out.println(result.subList(0, last + 1));
    }


    public static void main(String[] args) {
        
        TreeNode n1 = new TreeNode(1);
        TreeNode n3 = new TreeNode(3);
        TreeNode n6 = new TreeNode(6);
        TreeNode n9 = new TreeNode(9);
        TreeNode n2 = new TreeNode(2, n1, n3);
        TreeNode n7 = new TreeNode(7, n6, n9);
        TreeNode root = new TreeNode(4, n2, n7);

        Solution sol = new Solution();

        System.out.println("Tree before inversion:");
        printTree(root);  // [4, 2, 7, 1, 3, 6, 9]

        TreeNode invertedRoot = sol.invertTree(root);

        System.out.println("Tree after inversion:");
        printTree(invertedRoot);  // [4, 7, 2, 9, 6, 3, 1]


    }
}