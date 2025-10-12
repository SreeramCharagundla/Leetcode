class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val = val;
    }
}

public class Learning {
    public static void main(String[] args) {
         TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Step 2: Print basic structure
        System.out.println("Root: " + root.val);
        System.out.println("Left Child of Root: " + root.left.val);
        System.out.println("Right Child of Root: " + root.right.val);
        System.out.println("Left Child of Left Node: " + root.left.left.val);
        System.out.println("Right Child of Left Node: " + root.left.right.val);
    }    
}
