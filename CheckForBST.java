class Solution {
    private boolean helper(Node root, int max, int min){
        if(root == null){
            return true;
        }
        if ( root.data >= max || root.data <= min){
            return false;
        }
        boolean sp1 = helper ( root.left, root.data, min);
        boolean sp2 = helper ( root.right, max, root.data);
        return sp1 && sp2;
    }
    // Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root) {
        return helper(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }
}