package week02.p3;

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
    
    boolean isEmpty() {
        if (root == null)
            return true;
        else
            return false;
    }
    
    BinaryTree leftTree() {
        BinaryTree newTree = new BinaryTree();
        newTree.root = root.left;
        return newTree;
    }
    
    BinaryTree rightTree() {
        BinaryTree newTree = new BinaryTree();
        newTree.root = root.right;
        return newTree;
    }
    
    Object rootData() {
        if (isEmpty() == true)
            return null;
        else
            return root.data;
    }
    
    void inorder() {
        BinaryTree rooter = this;
        TreeNode cursor = rooter.root;
        TreeNode temp = cursor;
    }
}