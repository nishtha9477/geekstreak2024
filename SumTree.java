public class SumTree {
    boolean isSumTree(Node root) {
        
        return helper(root)!=0;
    }
     private int helper(Node root){
        if(root == null) return 0;
        if(root.left == root.right) return root.data;
        int left = helper(root.left);
        int right = helper(root.right);
        if(root.data != left+right){
            return 0;
        }
        return root.data+left+right;
    }
}
    

