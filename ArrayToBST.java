class Solution {
    public static Node SortedBST(int[] nums, int low, int high){
        if(low>high){
            return null;
        }
        int mid = low + (high - low )/2;
        Node node = new Node(nums[mid]);
        
        node.left = SortedBST(nums, low, mid-1);
        node.right = SortedBST(nums, mid+1, high);
        return node;
    }
    public Node sortedArrayToBST(int[] nums) {
        return SortedBST(nums, 0, nums.length -1);
       
    }
}