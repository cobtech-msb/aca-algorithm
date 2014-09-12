package week02.p1;

class BinaryTree {
    class TreeNode {
        Object data;
        TreeNode left;
        TreeNode right;
    }
    
    TreeNode root;
    
    BinaryTree() {
        root = null;
    }
    
    public BinaryTree(BinaryTree left, Object data, BinaryTree right) {
        root = new TreeNode();
        root.data = data;
        root.left = left.root;
        root.right = right.root;
    }
}